public class setter_getter {

    public static void main(String[] args) {

        class Pengurus {
            int idPengurus;
            String gender;
            String divisi;
            String jabatan;

            public Pengurus(int a, String b, String c) {
                idPengurus = a;
                gender = b;
                divisi = c;
            }

            public void setJabatan(String x) {
                this.jabatan = x;
            }

            public String getJabatan() {
                return this.jabatan;
            }
        }
        //inisialisasi objek
        Pengurus Aisyah = new Pengurus(001, "Perempuan", "PSDM");

        //memanggil setter method
        Aisyah.setJabatan("anggota divisi PSDM");
        System.out.println(Aisyah.jabatan);

        //memanggil getter method
        System.out.println(Aisyah.getJabatan());

        class Ormawa {
            String universitas;
            int jumlahDivisi;
            int jumlahPengurus;
            String namaProker;

            public Ormawa(String n, int m, int p) {
                universitas = n;
                jumlahDivisi = m;
                jumlahPengurus = p;

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
        HIMASIF.setProker("IT Convert");
        System.out.println(HIMASIF.namaProker);

        //memanggil getter method
        System.out.println(HIMASIF.getProker());
    }
}