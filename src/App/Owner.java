    package src.Entity.App;




    import static java.lang.System.*;

    public class Owner  {
        private String name;
        private String email;

        private Listing address;

        public Owner() {
        }

        public Owner(String name, String email, Listing address) {
            this.name = name;
            this.email = email;
            this.address = address;
        }


        public void clientNum(String nickName){
            out.println(nickName+ " 999");
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Listing getAddress() {
            return address;
        }

        public void setAddress(Listing address) {
            this.address = address;
        }


    }