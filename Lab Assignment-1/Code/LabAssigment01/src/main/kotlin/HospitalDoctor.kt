class HospitalDoctor (var badgeNumber: String, name: String,  registry: Int, phoneNumber: String) : Doctor(name, registry, phoneNumber), ICanOperate {
    override fun toString(): String {
        return name+ " " + "(" +registry+ ")"+ " - " + getPhoneNumber() + " " +"Badge: "+badgeNumber
    }

    override fun operateOnPatient(): String {
        return "Scalpel Please"
    }
}