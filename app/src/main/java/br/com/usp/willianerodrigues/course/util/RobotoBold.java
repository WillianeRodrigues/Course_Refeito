package br.com.usp.willianerodrigues.course.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by rapha on 16/04/2016.
 */
public class RobotoBold extends TextView {

    public RobotoBold(Context context) {
        super(context);
        setTypeface(context);
    }

    public RobotoBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(context);
    }

    public RobotoBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RobotoBold(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setTypeface(context);
    }

    private void setTypeface(Context context) {
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/roboto_bold.ttf"));
    }
}
