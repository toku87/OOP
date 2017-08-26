//package PersonIBirthDay;
//
//
//public class BirthDay {
//private String _year;
//private String _month;
//private String _day;
//
//    public BirthDay (String _PESEL) {
//        this._year = year;
//        this._month = month;
//        this._day = day;
//    }
//        String yearInPesel = "";
//        String monthInPesel = "";
//        String dayInPesel="";
//public String setDate(){
//        if (Integer.parseInt(_PESEL.substring(2,4))>=81 && Integer.parseInt(_PESEL.substring(2,4))<=92 ){
//            StringBuilder sb = new StringBuilder();
//            sb.append("18").append(_PESEL.substring(0,2));
//            yearInPesel = sb.toString();
//            monthInPesel = _PESEL.substring(2,4);
//            int monthTemp = Integer.parseInt(monthInPesel);
//            int month = Math.abs(80 - monthTemp);
//            monthInPesel = Integer.toString(month);
//            dayInPesel = _PESEL.substring(4,6);
//        }
//        else if (Integer.parseInt(_PESEL.substring(2,4))>=1 && Integer.parseInt(_PESEL.substring(2,4))<=12 ){
//            StringBuilder sb = new StringBuilder();
//            sb.append("19").append(_PESEL.substring(0,2));
//            yearInPesel = sb.toString();
//            monthInPesel = _PESEL.substring(2,4);
//            dayInPesel = _PESEL.substring(4,6);
//        }
//        else  {
//            StringBuilder sb = new StringBuilder();
//            sb.append("20").append(_PESEL.substring(0,2));
//            yearInPesel = sb.toString();
//            monthInPesel = _PESEL.substring(2,4);
//            int monthTemp = Integer.parseInt(monthInPesel);
//            int month = (20 - monthTemp);
//            monthInPesel = Integer.toString(month);
//            dayInPesel = _PESEL.substring(4,6);
//        }
//        String gender = _PESEL.substring(9,10);
//        if (Integer.parseInt(gender)%2 ==0 || (Integer.parseInt(gender))%2==2){
//            _gender = 'F';
//        }else
//            _gender = 'M';
//
//        return setUserData();
//    }
//
//}
