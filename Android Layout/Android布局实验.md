# Android布局实验
## 1. 线性布局
### I. 工程名
AndroidTest
### II. 主要源代码
    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:orientation="vertical"
        android:background="#000"
    >

    <LinearLayout
    android:layout_width="match_parent"
    android:layout_height="50dp"
    android:orientation="horizontal">
        <TextView
            android:text="One,One"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="One,Two"
            android:layout_width="440dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="One,Three"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="One,Four"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="50dp">
        <TextView
            android:text="Two,One"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Two,Two"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Two,Three"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Two,Four"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="50dp">
        <TextView
            android:text="Three,One"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Three,Two"
            android:layout_width="440dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Three,Three"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Three,Four"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>

    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="50dp">
        <TextView
            android:text="Four,One"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Four,Two"
            android:layout_width="440dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Four,Three"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
        <TextView
            android:text="Four,Four"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:layout_margin="3px"
            android:background="@drawable/textview_border"
            android:textColor="@color/colorwhite"
            android:gravity="center"/>
    </LinearLayout>
    </LinearLayout>


### III. 实验截图
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/242867F17EF34F1E97BB3134A4B5C56C/18)

## 2. 相对布局
### I. 工程名
RelativeLayoutExamples
### II. 主要源代码
    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="200dp"
    android:background="#000">

    <TextView
        android:id="@+id/red"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="18dp"
        android:text="RED"
        android:textColor="#000"
        android:background="@color/colorRed"
        android:layout_alignParentLeft="true" />
    <TextView
        android:id="@+id/yellow"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="18dp"
        android:text="YELLOW"
        android:textColor="#000"
        android:background="@color/colorYellow"
        android:layout_alignParentRight="true" />
    <TextView
        android:id="@+id/orange"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="18dp"
        android:text="ORANGE"
        android:textColor="#000"
        android:background="@color/colorOrange"
        android:layout_centerHorizontal="true" />
    <TextView
        android:id="@+id/blue"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="18dp"
        android:text="BLUE"
        android:textColor="#000"
        android:background="@color/colorBlue"
        android:layout_centerInParent="true" />
    <TextView
        android:id="@+id/green"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="18dp"
        android:text="GREEN"
        android:textColor="#000"
        android:background="@color/colorGreen"
        android:layout_alignTop="@id/blue"
        android:layout_centerVertical="true"
        android:layout_toLeftOf="@id/blue"
        android:layout_marginRight="20dp" />
    <TextView
        android:id="@+id/indigo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="18dp"
        android:text="INDIGO"
        android:textColor="#000"
        android:background="@color/colorIndigo"
        android:layout_centerVertical="true"
        android:layout_toRightOf="@id/blue"
        android:layout_marginLeft="20dp" />
    <TextView
        android:id="@+id/violet"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:padding="18dp"
        android:text="VIOLET"
        android:textColor="#000"
        android:background="@color/colorViolet"
        android:layout_centerHorizontal="true"
        android:layout_alignParentBottom="true" />

    </RelativeLayout>
### III. 实验截图
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/9D271F61594A4A559B2D208E53E4D69A/33)

## 3. 表格布局
### I. 工程名
TableLayoutExamples
### II. 主要源代码
    <?xml version="1.0" encoding="utf-8"?>
    <TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#000"
        android:stretchColumns="1" >
    <TableRow>
        <TextView
            android:textColor="#F0FFF0"
            android:text="Open..."
            android:textSize="23dp"
            android:layout_column="1"
            android:paddingLeft="20dp"/>
        <TextView
            android:textColor="#F0FFF0"
            android:text="Ctrl-O"
            android:textSize="23dp"
            android:gravity="right"
            android:paddingRight="10dp" />
    </TableRow>
    <TableRow>
        <TextView
            android:textColor="#F0FFF0"
            android:text="Save..."
            android:textSize="23dp"
            android:layout_column="1"
            android:paddingLeft="20dp"/>
        <TextView
            android:textColor="#F0FFF0"
            android:text="Ctrl-S"
            android:textSize="23dp"
            android:gravity="right"
            android:paddingRight="10dp" />
    </TableRow>
    <TableRow>
        <TextView
            android:textColor="#F0FFF0"
            android:text="Save AS..."
            android:textSize="23dp"
            android:layout_column="1"
            android:paddingLeft="20dp"/>
        <TextView
            android:textColor="#F0FFF0"
            android:text="Ctrl-Shift-S"
            android:textSize="23dp"
            android:gravity="right"
            android:paddingRight="10dp" />
    </TableRow>
    <TextView
        android:layout_height="2dp"
        android:background="#F0FFF0"
        android:layout_marginTop="2dp"
        android:layout_marginBottom="2dp"/>
    <TableRow>
        <TextView
            android:textColor="#F0FFF0"
            android:text="X Import..."
            android:textSize="23dp"
            android:paddingLeft="3dp"
            android:layout_column="1" />
    </TableRow>
    <TableRow>
        <TextView
            android:textColor="#F0FFF0"
            android:text="X Export..."
            android:textSize="23dp"
            android:paddingLeft="3dp"
            android:layout_column="1" />
        <TextView
            android:textColor="#F0FFF0"
            android:text="Ctrl-E"
            android:textSize="23dp"
            android:gravity="right"
            android:paddingRight="10dp" />
    </TableRow>
    <TextView
        android:layout_height="2dp"
        android:background="#F0FFF0"
        android:layout_marginTop="2dp"
        android:layout_marginBottom="2dp"/>
    <TableRow>
        <TextView
            android:textColor="#F0FFF0"
            android:text="Quit"
            android:textSize="23dp"
            android:layout_column="1"
            android:paddingLeft="20dp"/>
    </TableRow>
    </TableLayout>
### II. 实验截图
![image](https://note.youdao.com/yws/public/resource/c1eee1ea5aba9bb41e017858f53d2dec/xmlnote/A1880B6BF1C34B07B33D06ADC92096FD/54)