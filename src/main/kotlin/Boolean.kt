fun main() {
    val nilai = 75
    val hasil:String
    hasil = if (nilai>=90 && nilai<=100){
        "Grade A"
    }else if (nilai>=80 && nilai<90){
        "Grade B"
    }else if (nilai>=70 && nilai<80){
        "Grade C"
    }else if (nilai>=60 && nilai<70){
        "Grade D"
    }else if(nilai<60 && nilai>=0) {
        "Grade E"
    }else {
        "nilai Salah"
    }
    print(hasil)
}