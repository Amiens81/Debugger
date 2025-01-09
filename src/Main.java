public class Main {
	public static void main(String[] args) {
        FirstTask();
		SecondTask();
	}
	//todo Первая задача
public static void FirstTask(){
	int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int numMax = Integer.MIN_VALUE;

	for(int i = 0; i < array.length; i++){
		if(array[i] > numMax && array[i] % 2 == 0 ){
			numMax = array[i];
		}
	}
	System.out.println("Максимальное чётное число в массиве: " + numMax);
}
//todo Вторая задача
	public static void SecondTask(){
		String str = "Привет, Александр, с праздником, с Новым Годом";
		StringBuilder strbuilder = new StringBuilder();
		for(char chr : str.toCharArray()){
			if(Character.isUpperCase(chr)){
                strbuilder.append(Character.toLowerCase(chr));
			}else{
				strbuilder.append(Character.toUpperCase(chr));
			}
		}
		System.out.println("Смена регистра символов на противоположный: \n" + strbuilder);
	}
}