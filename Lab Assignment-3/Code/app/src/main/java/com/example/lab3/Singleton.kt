import com.example.lab3.SampleModel

object Singleton {
    private var list : MutableList<SampleModel> = mutableListOf()
    fun notesList() : MutableList<SampleModel> {
        return list
    }
    fun insertData( nameList : MutableList<SampleModel>){
        list.addAll(nameList)
    }
}

/* Code Reference:
[1] https://stackoverflow.com/questions/49007322/how-to-use-singleton-class-to-pass-list-data-from-one-fragment-to-another
[2] https://stackoverflow.com/questions/55979644/am-i-having-kotlin-functions-return-a-list-correctly
*/