# NoteBook2
这是2018年10月5日的代码记录，用Android Studio编写一个备忘录app。

1、关键代码位置：“APP”->“src”->“main”

2、其中res文件夹内drawable是内置的背景图文件：c1.jpg，用法：android:background="@drawable/c1"，在所需要布置背景图的布局文件XX.xml下的首要：    
   
   <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    
    android:layout_width="match_parent"
    
    android:layout_height="match_parent"
    
    android:orientation="vertical"
    
    android:background="@drawable/c1"> //代码如左边所示
   
   </LinearLayout>

3、布局文件在res文件下的layout文件夹内，此项目共有3个可视页面，4个布局文件，分别是：activity_main.xml布局是主活动布局页面，展示布局页面list.xml， 
   
   add_list.xml添加布局页面和select.xml选择布局页面。

4、java文件在res同级的文件夹中，笔者计算机名为：michaelxuzhi，故在michaelxuzhi-notebook2文件夹内存储class文件，需要clone此项目的小伙伴请自行修改文 
   
   件内首行：package com.example.michaelxuzhi.notebook2;

5、此项目调用到Android Studio本身自带的SQLite来储存所编辑好的备忘录，所以NotesDB.class是用以建立表来写入数据类型。
