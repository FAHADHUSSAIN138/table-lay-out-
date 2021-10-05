[11:38 pm, 04/10/2021] FAHAD HUSSAIN SHAHID: <?xml version="1.0" encoding="utf-8"?>
<LinearLayout
android:id="@+id/myLinearLayout"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
        android:background="#ff0033cc"
        android:padding="4dip"
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:orientation="horizontal" >
<TextView
android:id="@+id/labelUserName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#ffff0066"
        android:text="User Name"
        android:textSize="16sp"
        android:textStyle="bold"
        android:textColor="#ff000000"
        >
</TextView>
<EditText
android:id="@+id/ediName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="18sp"
        >
</EditText>
<Button
android:id="@+id/btnGo"
        android:layout_width…
        [11:38 pm, 04/10/2021] FAHAD HUSSAIN SHAHID: <?xml version="1.0" encoding="utf-8"?>
<TableLayout
    android:id="@+id/myTableLayout"
            android:layout_width="fill_parent"
            android:layout_height="fill_parent"
            android:background="#ff0033cc"
            android:orientation="vertical"
            xmlns:android="http://schemas.android.com/apk/res/android"
            >
<TableRow>
<TextView
            android:text="URL:" />
<EditText android:id="@+id/ediUrl"
        android:layout_span="3"/>
</TableRow>
<View
        android:layout_height="3dip"
                android:background="#0000FF" />
<TableRow>
<Button android:id="@+id/cancel"
        android:layout_column="2"
        android:text="Cancel" />
<Button android:id="@+id/ok"
        android:text="OK" />
</TableRow>
<View
        android:layout_height="3dip"
                android:background="#0000FF" />
</TableLayout>