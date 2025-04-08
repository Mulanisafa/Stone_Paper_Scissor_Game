package Scanner_class;
import java.util.Scanner;
public class horoscope_predictor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input: Month and day of birth
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();
        
        String zodiacSign = getZodiacSign(month, day);

        // Output the zodiac sign
        System.out.println("Your zodiac sign is: " + zodiacSign);

        // Provide a horoscope prediction using switch case
        String horoscope = getHoroscopePrediction(zodiacSign);
        System.out.println("Horoscope Prediction: " + horoscope);

        scanner.close();
    }
	
	public static String getZodiacSign(int month, int day) {
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else {
            return "Capricorn";
        }
    }

    // Method to provide a horoscope prediction using switch case
    public static String getHoroscopePrediction(String zodiacSign) {
        String prediction;
        switch (zodiacSign) {
            case "Aquarius":
                prediction = "You are innovative and forward-thinking. Today is a great day to start a new project.";
                break;
            case "Pisces":
                prediction = "Your intuition is strong today. Trust your instincts in making decisions.";
                break;
            case "Aries":
                prediction = "You are full of energy and enthusiasm. Use it to tackle challenges head-on.";
                break;
            case "Taurus":
                prediction = "Stay grounded and focused on your goals. Patience will lead to success.";
                break;
            case "Gemini":
                prediction = "Communication is your strength today. Share your ideas with others.";
                break;
            case "Cancer":
                prediction = "Emotions may run high today. Take time to reflect and recharge.";
                break;
            case "Leo":
                prediction = "Your confidence is shining. Use it to inspire those around you.";
                break;
            case "Virgo":
                prediction = "Attention to detail will pay off today. Stay organized and focused.";
                break;
            case "Libra":
                prediction = "Balance is key today. Seek harmony in your relationships and decisions.";
                break;
            case "Scorpio":
                prediction = "Your determination is unmatched. Dive deep into your passions today.";
                break;
            case "Sagittarius":
                prediction = "Adventure calls! Embrace new experiences and opportunities.";
                break;
            case "Capricorn":
                prediction = "Hard work and discipline will lead to success. Stay committed to your goals.";
                break;
            default:
                prediction = "No prediction available for this zodiac sign.";
                break;
        }
        return prediction;
        
    }

}
