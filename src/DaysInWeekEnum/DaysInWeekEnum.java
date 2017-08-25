package DaysInWeekEnum;


public class DaysInWeekEnum {

    enum DaysOfWeek {
            MONDAY("Poniedziałek"),

            TUESDAY("Wtorek"),

            WEDNESDAY("Sroda"),

            THURSDAY("Czwartek"),

            FRIDAY("Piątek"),

            SATURDAY("Sobota"),

            SUNDAY("Niedziela");

            private final String dniTygodnia;

            DaysOfWeek(String dniTygodnia) {
                this.dniTygodnia = dniTygodnia;
            }

            public String getDniTygodnia() {
                return dniTygodnia;
            }
        }
    }
















