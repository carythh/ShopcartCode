## ShopcartCode
购物车数量加减

使用方法： <br>  
1.在项目根目录添加 <br>  
 	 
		repositories {  
			maven { url 'https://jitpack.io' }  
		}  
	 
  
  2.在项目目录build.gradle添加  <br>  
   
	  compile 'com.github.d746997:ShopcartCode:1.0'  
	 

3.    <com.duanc.app.shopcart.AddMinusView <br>  
        android:id="@+id/add" <br>  
        android:layout_width="wrap_content" <br>  
        android:layout_height="wrap_content" <br>  
        app:addtextbg="@drawable/box_val" <br>  
        app:alltextsize="5sp" <br>  
        app:buttonheight="30dp" <br>  
        app:buttonwidth="30dp" <br>  
        app:minustextbg="@drawable/box_val" <br>  
        app:textbg="@color/white" <br>  
        app:textcolor="@color/colorPrimary" <br>  
        app:textwidth="60dp" <br>  
        /> <br>  
