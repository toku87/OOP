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

            public static class DaysOfWeekTest {
                public static void main(String[] args) {
                    for (DaysOfWeek days : DaysOfWeek.values()) {
                        System.out.printf("%s\n", days.getDniTygodnia());
                    }
                }
            }
        }
    }









