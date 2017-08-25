package MyTime;


public class MyTime {

    private int _hour = 0;
    private int _minute = 0;
    private int _second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        _hour = hour;
        _minute = minute;
        _second = second;
    }

    public void setTime(int hour, int minute, int second) {
        _hour = hour;
        _minute = minute;
        _second = second;
    }

    public int getHour() {
        return _hour;
    }

    public int getMinute() {
        return _minute;
    }

    public int getSecond() {
        return _second;
    }

    public void setHour(int hour) {
        if (hour < 24 && hour >= 0) {
        _hour = hour;}
        else {
            _hour = -10;
        }
    }

    public void setMinute(int minute) {
        if (minute < 60 && minute >= 0) {
        _minute = minute;}
        else {
            _minute = -10;
        }
    }

    public void setSecond(int second) {
        if (second < 60 && second >= 0){
        _second = second;}
        else {
            _second=-10;
        }
    }

    public String toString() {
        return String.format("%02d : %02d : %02d", _hour, _minute, _second);
    }

    public MyTime nextSecond () {
        if (_second == 59) {
            setSecond(0);
            nextMinute();
        } else
            _second = _second + 1;
        return this;
    }

    public MyTime nextMinute() {
        if (_minute == 59) {
            setMinute(0);
            nextHour();
        } else
            _minute = _minute + 1;
        return this;
    }

    public MyTime nextHour() {
        if (_hour == 23) {
            setHour(0);
        } else
            _hour = _hour + 1;
        return this;
    }
    public MyTime previousSecond () {
        if (_second==0) {
            setSecond(59);
            previousMinute();
        }
        else
            _second = _second-1;
        return this;
    }
    public MyTime previousMinute () {
        if (_minute==0) {
            setMinute(59);
            previousHour();
        }else _minute = _minute-1;
        return this;
    }
    public MyTime previousHour() {
        if (_hour==0) {
            setHour(23);
        }else
            _hour = _hour - 1;
        return this;
    }
}
