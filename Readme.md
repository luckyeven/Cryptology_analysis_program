Cryptology_analysis_program v1.0
================================

Hello. Welcom to my git. This is a Cryptology analysis program develpoed with JAVA. In this program I will implement a number of functions releated to cryptology.


****
	
|Author|ssong094@uottawa.ca|
|---|---
|WeChat|tz142857


****
## Table of Contents
* [KeyWord Cipher](#KeyWordCipher)
    * [Demo](#Demo)
   
### KeyWordCipher
------------------

A keyword cipher is a form of monoalphabetic substitution. A keyword is used as the key,and it determines the letter matchings of the cipher alphabet to the plain alphabet. 
* select a keyword, and if the keyword has repeated letters, remove all identical letters except for the first occurrence. For example, if the selected keyword is "success", use "suces".
* Write the keyword at the bottom of the alphabet and fill in the remaining spaces with the other letters of the alphabet in standard order.

Take the first example, we used "secret" keyword there.  
**Plain Text : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z**  
When "secret" keyword is used, the new encypting text becomes :  
**Encrypting : S E C R T A B D F G H I J K L M N O P Q U V W X Y Z**  
This means 'A' means 'S', 'B' means 'E' and 'C' means 'C' and so on.  

An improved version is to allow keywords to start anywhere in the alphabet. For example:  

We use "pacific" keyword , start at "k".  
**Plain Text : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z**  
the new encypting text becomes :  
**Encrypting : Q R S T U V W X Y Z P A C I F B D E G H J K L M N O**  

#### Demo
---------
In the Crptplogyy_analysis_program file. compile ****keyCipher.java**** and run ****keyCipher****.  
*This demo can help you to auto generate encrypt text.*

![](https://secureservercdn.net/198.71.233.47/k3x.d37.myftpupload.com/wp-content/uploads/2020/08/keywordcipher.gif?time=1596568436)  


 




