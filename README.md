# seg3103_playground
_____________________________________________
**Lab 1**
I used WSL to run the bash scripts

Open wsl using CMD or  Powershell

Navigate to (newmath_java or newmath_ex or newmath_ex) and run : 
   ./bin/run
   ./bin/test

Mohamed Yatera
300280976
myate081@uottawa.ca

_____________________________________________
**Lab 2**

I used WSL to run the test through ./bin/test

DateTest.java: Simple JUnit test where i assert (Expected, actual), Should pass test if they are the same. I included the 
Ones that failed. I am aware that they do not pass the test, but i wasnt sure if i was supposed to take them out or not,
we know they are going to fail the test case since it doesnt pass the valid equivalence classes

DateNextDateOkTest.java: Same thing as DateTest.java expect this test is paramaterized meaning i dont write a test case for every single
test case, i write one "test case code" and the test case values will be passed through one by one.

DateNextDateExceptionTest.java: Supposed to be the same as the one right above ^ expect its for the ones throwing 
an Illegal argument exception (Lower half of given table)

Mohamed Yatera
300280976
myate081@uottawa.ca

_____________________________________________
**Lab 3**

I used WSL to run the test through ./bin/jacoco

Before starting i went through the Date.java code and DateTest.java code. Since it was used for lab02 i was already familiar with them

After this i ran jacoco to see what branches/statements were missing coverage

I then wrote the test cases one by one in the DateTest.java to maximize coverage.

After that i did some refactoring of Data.java to handle the edge cases and areas that i was  able to enter (if statements)

Lastly, i went back to my test cases for some additonal test code and some refactoring to achieve 100% coverage

Mohamed Yatera
300280976
myate081@uottawa.ca

_____________________________________________
**Lab 4**

I was unable to do the TDD in the exact same project folder that contains the other labs, so i made another repo and did the TDD over there. 

This is the link of the repo containing all the commits:
https://github.com/MohamedYatera/TDD

Please contact if link is not working

One of the files contains the code while the other contains the test cases. I followed the TDD approach:
Red: Test Case that fails becaues of lack of code implementation
Green: Test cases passes because of bare minimum code implementation
Refactor: Change code/test to make them more efficient/cleaner

Mohamed Yatera
300280976
myate081@uottawa.ca
