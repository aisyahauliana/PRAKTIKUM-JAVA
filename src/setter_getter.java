public class setter_getter {

    public static void main(String[] args) {

        class Pengurus {
            String namaPengurus;
            int idPengurus;
            String gender;
            String divisi;
            String jabatan;
            boolean adaProker;
            int jumlahProker;
            boolean statusAktif;
            String periode;

            public Pengurus(String a, int b, String c) {
                namaPengurus = a;
                idPengurus = b;
                gender = c;
            }

            public void setJabatan(String x) {
                this.jabatan = x;
            }

            public String getJabatan() {
                return this.jabatan;
            }
        }
        //inisialisasi objek
        Pengurus pengurus1 = new Pengurus("Aisyah", 001,"Perempuan");
        Pengurus pengurus2 = new Pengurus("Amara",002,"Perempuan");
        Pengurus pengurus3 = new Pengurus("Abel", 003, "Laki-laki");
        Pengurus pengurus4 = new Pengurus("Dikta",004, "Laki-laki");
        Pengurus pengurus5 = new Pengurus("Sastra", 005,"Laki-laki");

        //memanggil setter method
        pengurus1.setJabatan("anggota divisi PSDM");
        System.out.println(pengurus1.jabatan);

        //memanggil getter method
        System.out.println(pengurus1.getJabatan());

        class Ormawa {
            String universitas;
            String namaOrmawa;
            int jumlahDivisi;
            Pengurus pengurus1;
            Pengurus pengurus2;
            Pengurus pengurus3;
            Pengurus pengurus4;
            Pengurus pengurus5;
            boolean prokerOngoing;
            String namaProker;
            int jumlahProker;
            boolean periodeDibuka;

            public Ormawa(String n, int m, int p) {
                universitas = n;
                jumlahDivisi = m;
                jumlahProker = p;

            }

            public void setProker(String y) {
                this.namaProker = y;
            }

            public String getProker() {
                return this.namaProker;
            }
        }

        //inisialisasi objek
        Ormawa HIMASIF = new Ormawa("UNEJ", 2, 5);

        //memanggil setter method
        HIMASIF.setProker("Serigala Sistem Informasi (SSI)");
        System.out.println(HIMASIF.namaProker);

        //memanggil getter method
        System.out.println(HIMASIF.getProker());
    }
}