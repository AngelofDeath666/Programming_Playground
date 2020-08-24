package com.company.week3;

import java.util.Scanner;

public class ASCIITable {
    public static void main (String[] args){
        char A = 'A', B = 'B', C = 'C',D = 'D',E = 'E',F = 'F',G = 'G',H = 'H',I = 'I', J = 'J',K = 'K',L = 'L';
        char M = 'M', N='N' ,O = 'O',P = 'P',Q = 'Q',R = 'R',S = 'S',T = 'T',U = 'U',V ='V',W='W',X = 'X',Y = 'Y',Z = 'Z';
        char a ='a',b='b',c='c',d='d',e='e',f='f',g='f',h='h',i='i',j='j',k='k',l='l';
        char m='m',n='n',o='o',p='p',q='q',r='r',s='s',t='t',u='u',v='v',w='w',x='x',y='y',z='z';
        char n1 ='1',n2='2',n3='3',n4='4',n5='5',n6='6',n7='7',n8='8',n9='9',n0='0',s1='#',s2='!',s3='+',s4='\\';
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("exit")){ //you forgot r,s,t in both capital and lowercase
            char cha = input.charAt(0);
            if (cha == A || cha == B || cha == C ||cha == D ||cha == E ||cha == F ||cha == G ||cha == H ||cha == I ||cha == J ||cha == K ||cha == L ||cha == M ||cha == N ||cha == O ||cha == P ||cha == Q ||cha == U ||cha == V ||cha == W ||cha == X ||cha == Y ||cha == Z ){
                System.out.println("Tegnet er et stort bokstav");
            } else if (cha == a || cha == b || cha == c ||cha == d ||cha == e ||cha == f ||cha == g ||cha == h ||cha == i ||cha == j ||cha == k ||cha == l ||cha == m ||cha == n ||cha == o ||cha == p ||cha == q ||cha == u ||cha == v ||cha == w ||cha == x ||cha == y ||cha == z ){
                System.out.println("Tegnet er et lille bokstav");
            } else if (cha == n1 || cha == n2 || cha == n3|| cha == n4|| cha == n5|| cha == n6|| cha == n7|| cha == n8|| cha == n9|| cha == n0){
                System.out.println("Tegnet er et tal");
            } else if (cha == s1 || cha == s2|| cha == s3|| cha == s4) {
                System.out.println("Tegnet er et af de 4 specialtegn");
            } else {
                System.out.println("Tegnet er ikke kendt af dette program");
            }
            input = scanner.nextLine();
        }



    }
}
