====================================
Mobile Computing Assignment 01
Name: Faiza Umatiya
Banner: B00899642

====================================
1. The approach i took is to make the Doctor class, HospitalDoctor class and an interface named ICanOperate.
2. In Doctor class:
a) i made getter and setter for the  doctor's phoneNumber. Where i replace the doctor's phoneNumber with the value I set if the number is 10 characters long. 
b) If suppose the phoneNumber is an empty string so it should return false and replace the number with the value its set(should be 10 characters long). But the characters should be 10 characters long then only it should return true else it should return false.  
3. In HospitalDoctor class: 
a) The class inherits the properties and methods of the Doctor class and return the desired output in the given format i.e. phoneNumber, registry and badgeNumber using override property.
b) This class also implemented the methods of the interface using override property.
4. ICanOperate interface: has a method operateOnPatient()
a. In main method, i created an empty list and added the doctor objects using for each loop. Then i used if condition to check if the doctor is implementing the ICanoperate interface. If it is ,then return the statement "Scalpel Please".

=====================================

