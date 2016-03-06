package com.example.feralapp;
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
import com.example.fragment.ClassifyByCourse;
import com.example.fragment.ClassifyBySchool;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
<<<<<<< Updated upstream
/**
 * 分类页面
 * @author admin
 *
 */
=======
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

@SuppressLint("NewApi")
>>>>>>> Stashed changes
public class ClassificationFragmentAcitivity extends FragmentActivity {
	FragmentManager fragmentManager=getSupportFragmentManager();
    ClassifyByCourse classifyByCourse = new ClassifyByCourse();
    ClassifyBySchool classifyBySchool=new ClassifyBySchool();
    RadioButton course,school;
    RadioGroup group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classification_page);
        group=(RadioGroup) findViewById(R.id.classify_radiogroup);
        course=(RadioButton) findViewById(R.id.classify_course);
        school=(RadioButton) findViewById(R.id.classify_school);
        course.setChecked(true);
        group.setOnCheckedChangeListener(listener);
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.class_page,classifyByCourse);
        fragmentTransaction.add(R.id.class_page, classifyBySchool);
        fragmentTransaction.hide(classifyBySchool);
        fragmentTransaction.commit();

    }
	
	
    /*
     * 点击顶部菜单切换页面
     */
    
    
    OnCheckedChangeListener listener = new OnCheckedChangeListener() {
        
        @Override
        public void onCheckedChanged(RadioGroup arg0, int arg1) {
            // TODO Auto-generated method stub
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            switch(arg1){
            case R.id.classify_course:
                fragmentTransaction.hide(classifyBySchool);
                fragmentTransaction.show(classifyByCourse);
                fragmentTransaction.commit();
                break;
            case R.id.classify_school:
                fragmentTransaction.hide(classifyByCourse);
                fragmentTransaction.show(classifyBySchool);
                fragmentTransaction.commit();
                break;
                default:
                    break;
            }
        }
    };

	
}
