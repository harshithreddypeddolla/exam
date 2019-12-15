package com.example.exam;

import java.util.ArrayList;
import java.util.List;

class Details {

 private static Details instance=null;

 List<Info> information;
 private Details(){
   information=new ArrayList<>();

   for (int i=0;i<10;i++){

       Info info=new Info();
       info.id = i;
       info.name = "Student #" + i;
       info.passwords = "a" + i;

       information.add(info);

   }
 }
static Details getInstance(){
if(instance==null){
 instance=new Details();

}
return instance;
}

}
