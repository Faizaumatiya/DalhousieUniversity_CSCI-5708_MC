fun main(args : Array<String>) {
    var doctor1 = Doctor("Dr. Rajan Shah", 10, "9027619056")
    var doctor2 = Doctor("Dr. Karapurkar", 20, "9023605609")

    doctor1.setPhoneNumber("9782300123")
    doctor1.getPhoneNumber()
    doctor2.setPhoneNumber("9026715809")
    doctor2.getPhoneNumber()

    var hospitalDoctor1 = HospitalDoctor("AB123", "Dr. Amin", 30, "9026884560")
    var hospitalDoctor2 = HospitalDoctor("CD123", "Dr. Sheetal", 40, "902671001")
    var hospitalDoctor3 = HospitalDoctor("DF123", "Dr. Imez", 50, "9020567561")

    hospitalDoctor1.setPhoneNumber("9024512895")
    hospitalDoctor1.getPhoneNumber()
    hospitalDoctor2.setPhoneNumber("9028895567")
    hospitalDoctor2.getPhoneNumber()
    hospitalDoctor3.setPhoneNumber("9027771129")
    hospitalDoctor3.getPhoneNumber()


    var doctorList: List<Doctor> = emptyList()
    println("Doctor's list is empty: " + doctorList)
    println("Adding doctor's details in list....")
    doctorList = listOf(doctor1, doctor2, hospitalDoctor1, hospitalDoctor2, hospitalDoctor3)
    println("Doctor's List: ")
    for (i in doctorList) {
        println(i.toString())
        if(i is ICanOperate){
            println(i.operateOnPatient())
        }
    }
}

