package com.company;

public class AdapterImplements implements Adapter{
    //static으로 만들어 전역으로 만들었기 때문에 instance를 따로 만들지 않음
    //Math math;
    @Override
    public Float twiceOf(Float f) {
        //Math의 twoTime은 double을 받으니, adapter에서 float로 바꾸어줘야한다.
        //그렇게 바꾸어 클라이언트에게 전달되어야하는 것이다.
        //Float value = (float) Math.twoTime(f.doubleValue());

        //원래 사용하던 Math클래스의 알고리즘이 변경되었다면, 함수만 바꾸어주면 된다.
        Float value = Math.doubled(f.doubleValue()).floatValue();
        return value;
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("절반 함수 호출");
        return (float) Math.half(f.doubleValue());
    }
}
