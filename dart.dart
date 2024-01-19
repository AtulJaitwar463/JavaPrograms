void main() {
//   print("This is a Dart Program");
//   print(45);
//   ///this is my first dart program
//   ///this is documentation comment
//     //int a=10;//it is not dynamically changable
//    var b=20;//dynamically changable

//   dynamic a=10;
//   print(a);
//   a='Dart';
//   print(a);

//   String a= 'Peter';
//   String b = "Atul";
//   String c= 'It\'s Atul';
//   print(a);
//   print(b);
//   print(c);

//   String name = "Atul";
//   print ("My name is $name");

  //4. write a dart program add two numbers

  // var a=10;
//   var b=20;
//   var c = a+b;
//   print(c);
//   print(a+b);

  //1. write a program to oprint the age sand name of the user using string interpolation

//   var a=20;
//   String name ='Atul';

//   print("Age is $a and name is $name");

//  //2. wap to calculate the area of rectangle , square and circle using String manupulation

//   var l=10;
//   var b=20;

//   var r= b*l;
//   print("Area of Rectangle is $r");

//   var d =4;
//   print("Area of sqaure ${d*d} ");

//   var radius= 4;
//   var pi=3.14;
//   print("Area of Circle ${2*pi*radius} ");

//   //3. WAP a program to print hello I am "Atul jaitwar"and hello i'm "Atul"with singleand double quetes

//   String str1 ='"John Doe"';
//   String str2 ='I\'m "John Doe"';
//   print('Hello I am $str1');
//   print('Hello $str2');

  //5.

//   var name = "Peter";
//   print("In capital: ${name.toUpperCase()}");
//   print("Length of name: ${name.length}");

//   var s = "P E T E R";
//   print("Removing spacces: ${s.replaceAll(" ", "")}");

//   var n = "This is a program.This is a Dart program";

//   final var1 = 12; //cannot be modified in class or any method
//   print(var1);

//   const pi = 3.14; //it same as final but it can changable in Class with object
//   const area = 3.14 * 12 * 12;
//   print(area);

  //-operator----
  //6.
//     int a=10,b=3;
//   print("Quotient ${a~/b}");
  //7.
//   int friend =5;
//   double bill=6400;

//   print("splite the bill person ${bill/friend}");

  //Null Aware Operator
//   var a=null;
//   var b=20;
//   var res = a??b;
//   print(res);

  //-----Decision Making-----------

//   var a=32;
//   var b=23;
//   if(a>b){
//     print(a);
//   }

//     if(a>=0){
//       print("positive");
//     }
//   else{
//     print("negaative");
//   }

//   var c ="s";

//   if(c=='a'||c=='e'||c=='o'||c=='u'||c=='i'||c=='A'||c=='E'||c=='O'||c=='U'||c=='I')
//   {
//     print("$c is vowel");
//   }
//   else{
//     print("$c ic constant");
//   }

//   String str = 's';

//     var char = str.codeUnitAt(0);

//     if (char >= 65 && char <= 90) {
//       print('$char Uppercase character');
//     } else if (char >= 97 && char <= 122) {
//       print('$char Lowercase character');
//     } else if (char >= 48 && char <= 57) {
//       print('$char Digit');
//     } else {
//       print('$char Special character');
//     }

//   List num=[10,3,4,7,5,7];
//   for(int i in num)
//   {
//     if(i%2==0)
//     print(i);
//   }

//   var n=54;
//   List l=[];
//   for(int i=2;i<=n;i++)
//   {
//     if(n%i==0)
//     {
//       l.add(i);

//     }
//   }print(l);

//   List<String>names=['Atul','Shubham','Sumit','Abhay'];

//   print(names);

//   names.remove('Sumit');
//   print(names);
//   print(names[2]);

//   names.removeAt(2);
//   print(names);

  List<String> color_list = ["Red", "Green", "White", "Black"];

  print("First Color is: ${color_list.first}");
  print("last Color is: ${color_list.last}");

  print("${color_list.contains("Green")}");

  Set<int> num = {1};
  print("number set is empty : ${num.isEmpty}");
}
