## ShopcartCode
# 购物车数量加减

# 使用方法：
# 1.在项目根目录添加 <br>  
 ```
		allprojects {
    		repositories {
    			
    			maven { url 'https://jitpack.io' }
    		}
    	}
 ```
 # 2.在项目目录build.gradle添加  <br>  
   ```
		dependencies {
    	        	dependencies {
	        compile 'com.github.duanzc:ShopcartCode:1.1'
	}

    	}

   ```

  # 3. xml引用
  ```
     <com.duanc.app.shopcart.AddMinusView 
        android:id="@+id/add" 
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        app:addtextbg="@drawable/box_val"  
        app:alltextsize="5sp"  
        app:buttonheight="30dp" 
        app:buttonwidth="30dp" 
        app:minustextbg="@drawable/box_val" 
        app:textbg="@color/white"  
        app:textcolor="@color/colorPrimary"  
        app:textwidth="60dp" 
        />  
  ```
  # 4.activity 使用
  ```
    @BindView(R.id.add)
    AddMinusView add;
    
   add.setInventory(20)   //库存大小
                  .setOnNowNumListener(new AddMinusView.onNumListener() {
                      @Override
                      public void onNowNum(int i) {
                          Toast.makeText(MainActivity.this, ""+i, Toast.LENGTH_SHORT).show();
                      }
                  });
  ```
  # 5.属性
  ```
  | 属性 | 解释 |
 
  |addtextcolor | 加号文字颜色|
  |addtextbg | 加号背景|
  |minustextcolor|减号文字颜色|
  |minustextbg|减号背景|
  |buttonwidth|加减号的按钮宽度|
  |buttonheight|加减号按钮高度|
  |textwidth|文字按钮宽度|
  |textcolor|文字颜色|
  |textbg|文字背景|
  |alltextsize|所有按钮文字大小|
  
  ```
