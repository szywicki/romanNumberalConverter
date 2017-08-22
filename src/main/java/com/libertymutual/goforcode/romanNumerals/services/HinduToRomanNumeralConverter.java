package com.libertymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToCovert){
        String roman="";
        int repeat;
 
        repeat=numberToCovert/1000;
        for(int i=1; i<=repeat;i++){
            roman=roman+"M";
        }
        numberToCovert=numberToCovert%1000;
 
        repeat=numberToCovert/900;
        for(int i=1; i<=repeat;i++){
            roman=roman+"CM";
        }
        numberToCovert=numberToCovert%900;
 
        repeat=numberToCovert/500;
        for(int i=1; i<=repeat;i++){
            roman=roman+"D";
        }
        numberToCovert=numberToCovert%500;
 
        repeat=numberToCovert/400;
        for(int i=1; i<=repeat;i++){
            roman=roman+"CD";
        }
        numberToCovert=numberToCovert%400;
 
        repeat=numberToCovert/100;
        for(int i=1; i<=repeat;i++){
            roman=roman+"C";
        }
        numberToCovert=numberToCovert%100;
 
        repeat=numberToCovert/90;
        for(int i=1; i<=repeat;i++){
            roman=roman+"XC";
        }
        numberToCovert=numberToCovert%90;
 
        repeat=numberToCovert/50;
        for(int i=1; i<=repeat;i++){
            roman=roman+"L";
        }
        numberToCovert=numberToCovert%50;
 
        repeat=numberToCovert/40;
        for(int i=1; i<=repeat;i++){
            roman=roman+"XL";
        }
        numberToCovert=numberToCovert%40;
 
        repeat=numberToCovert/10;
        for(int i=1; i<=repeat;i++){
            roman=roman+"X";
        }
        numberToCovert=numberToCovert%10;
 
        repeat=numberToCovert/9;
        for(int i=1; i<=repeat;i++){
            roman=roman+"IX";
        }
        numberToCovert=numberToCovert%9;
 
        repeat=numberToCovert/5;
        for(int i=1; i<=repeat;i++){
            roman=roman+"V";
        }
        numberToCovert=numberToCovert%5;
 
        repeat=numberToCovert/4; 
        for(int i=1; i<=repeat;i++){
            roman=roman+"IV";
        }
        numberToCovert=numberToCovert%4;
 
        repeat=numberToCovert/1; // or simply repeat=n or i<=n in the condition part of the loop
        for(int i=1; i<=repeat;i++){
            roman=roman+"I";
        }
        return roman;
    }
}