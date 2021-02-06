package pl.derela.wszib.spotkanie2.zadanie2;

import java.math.BigInteger;

public class ChessBoard {

    public static void main(String[] args) {

        BigInteger[] chess = new BigInteger[64];

        for (int i = 0; i < chess.length; i++) {
            chess [i] = BigInteger.valueOf((long) Math.pow(2, i));
        }
        for (int i = 0; i < chess.length; i++) {
            System.out.println("Na polu szachownicy " +(i+1) + " znajduje się "+ chess[i] + " ziaren.");

        }
        BigInteger sum ;
        sum = BigInteger.valueOf(0);
                for (int i = 0; i < chess.length; i++) {
            sum = sum.add(chess[i]);

        }
        System.out.println("\nSuma wszystkich ziaren to " +sum);




    }
}

 /*   Przyklad wykorzystania typu obiektowego BigInteger
        nr pola: 0, ziarna na polu: 1, suma wszystkich ziaren: 1
        nr pola: 1, ziarna na polu: 2, suma wszystkich ziaren: 3
        nr pola: 2, ziarna na polu: 4, suma wszystkich ziaren: 7
        nr pola: 3, ziarna na polu: 8, suma wszystkich ziaren: 15
        nr pola: 4, ziarna na polu: 16, suma wszystkich ziaren: 31
        nr pola: 5, ziarna na polu: 32, suma wszystkich ziaren: 63
        nr pola: 6, ziarna na polu: 64, suma wszystkich ziaren: 127
        nr pola: 7, ziarna na polu: 128, suma wszystkich ziaren: 255
        nr pola: 8, ziarna na polu: 256, suma wszystkich ziaren: 511
        nr pola: 9, ziarna na polu: 512, suma wszystkich ziaren: 1023
        nr pola: 10, ziarna na polu: 1024, suma wszystkich ziaren: 2047
        nr pola: 11, ziarna na polu: 2048, suma wszystkich ziaren: 4095
        nr pola: 12, ziarna na polu: 4096, suma wszystkich ziaren: 8191
        nr pola: 13, ziarna na polu: 8192, suma wszystkich ziaren: 16383
        nr pola: 14, ziarna na polu: 16384, suma wszystkich ziaren: 32767
        nr pola: 15, ziarna na polu: 32768, suma wszystkich ziaren: 65535
        nr pola: 16, ziarna na polu: 65536, suma wszystkich ziaren: 131071
        nr pola: 17, ziarna na polu: 131072, suma wszystkich ziaren: 262143
        nr pola: 18, ziarna na polu: 262144, suma wszystkich ziaren: 524287
        nr pola: 19, ziarna na polu: 524288, suma wszystkich ziaren: 1048575
        nr pola: 20, ziarna na polu: 1048576, suma wszystkich ziaren: 2097151
        nr pola: 21, ziarna na polu: 2097152, suma wszystkich ziaren: 4194303
        nr pola: 22, ziarna na polu: 4194304, suma wszystkich ziaren: 8388607
        nr pola: 23, ziarna na polu: 8388608, suma wszystkich ziaren: 16777215
        nr pola: 24, ziarna na polu: 16777216, suma wszystkich ziaren: 33554431
        nr pola: 25, ziarna na polu: 33554432, suma wszystkich ziaren: 67108863
        nr pola: 26, ziarna na polu: 67108864, suma wszystkich ziaren: 134217727
        nr pola: 27, ziarna na polu: 134217728, suma wszystkich ziaren: 268435455
        nr pola: 28, ziarna na polu: 268435456, suma wszystkich ziaren: 536870911
        nr pola: 29, ziarna na polu: 536870912, suma wszystkich ziaren: 1073741823
        nr pola: 30, ziarna na polu: 1073741824, suma wszystkich ziaren: 2147483647
        nr pola: 31, ziarna na polu: 2147483648, suma wszystkich ziaren: 4294967295
        nr pola: 32, ziarna na polu: 4294967296, suma wszystkich ziaren: 8589934591
        nr pola: 33, ziarna na polu: 8589934592, suma wszystkich ziaren: 17179869183
        nr pola: 34, ziarna na polu: 17179869184, suma wszystkich ziaren: 34359738367
        nr pola: 35, ziarna na polu: 34359738368, suma wszystkich ziaren: 68719476735
        nr pola: 36, ziarna na polu: 68719476736, suma wszystkich ziaren: 137438953471
        nr pola: 37, ziarna na polu: 137438953472, suma wszystkich ziaren: 274877906943
        nr pola: 38, ziarna na polu: 274877906944, suma wszystkich ziaren: 549755813887
        nr pola: 39, ziarna na polu: 549755813888, suma wszystkich ziaren: 1099511627775
        nr pola: 40, ziarna na polu: 1099511627776, suma wszystkich ziaren: 2199023255551
        nr pola: 41, ziarna na polu: 2199023255552, suma wszystkich ziaren: 4398046511103
        nr pola: 42, ziarna na polu: 4398046511104, suma wszystkich ziaren: 8796093022207
        nr pola: 43, ziarna na polu: 8796093022208, suma wszystkich ziaren: 17592186044415
        nr pola: 44, ziarna na polu: 17592186044416, suma wszystkich ziaren: 35184372088831
        nr pola: 45, ziarna na polu: 35184372088832, suma wszystkich ziaren: 70368744177663
        nr pola: 46, ziarna na polu: 70368744177664, suma wszystkich ziaren: 140737488355327
        nr pola: 47, ziarna na polu: 140737488355328, suma wszystkich ziaren: 281474976710655
        nr pola: 48, ziarna na polu: 281474976710656, suma wszystkich ziaren: 562949953421311
        nr pola: 49, ziarna na polu: 562949953421312, suma wszystkich ziaren: 1125899906842623
        nr pola: 50, ziarna na polu: 1125899906842624, suma wszystkich ziaren: 2251799813685247
        nr pola: 51, ziarna na polu: 2251799813685248, suma wszystkich ziaren: 4503599627370495
        nr pola: 52, ziarna na polu: 4503599627370496, suma wszystkich ziaren: 9007199254740991
        nr pola: 53, ziarna na polu: 9007199254740992, suma wszystkich ziaren: 18014398509481983
        nr pola: 54, ziarna na polu: 18014398509481984, suma wszystkich ziaren: 36028797018963967
        nr pola: 55, ziarna na polu: 36028797018963968, suma wszystkich ziaren: 72057594037927935
        nr pola: 56, ziarna na polu: 72057594037927936, suma wszystkich ziaren: 144115188075855871
        nr pola: 57, ziarna na polu: 144115188075855872, suma wszystkich ziaren: 288230376151711743
        nr pola: 58, ziarna na polu: 288230376151711744, suma wszystkich ziaren: 576460752303423487
        nr pola: 59, ziarna na polu: 576460752303423488, suma wszystkich ziaren: 1152921504606846975
        nr pola: 60, ziarna na polu: 1152921504606846976, suma wszystkich ziaren: 2305843009213693951
        nr pola: 61, ziarna na polu: 2305843009213693952, suma wszystkich ziaren: 4611686018427387903
        nr pola: 62, ziarna na polu: 4611686018427387904, suma wszystkich ziaren: 9223372036854775807
        nr pola: 63, ziarna na polu: 9223372036854775808, suma wszystkich ziaren: 18446744073709551615
        nr pola: 64, ziarna na polu: 18446744073709551616, suma wszystkich ziaren: 36893488147419103231
*/