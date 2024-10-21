// Definisi class Produk
class Produk(
    val nama: String,
    var harga: Double,
    var stok: Int,
    val deskripsi: String,
    val kategori: String,
    val berat: Double,
    var diskon: Int = 0 // Diskon default adalah 0%
) {
    fun tampilkanInfo() {
        println("Detail Produk:")
        println("Nama         : $nama")
        println("Harga        : Rp ${"%.2f".format(harga)}")
        println("Stok         : $stok unit")
        println("Deskripsi    : $deskripsi")
        println("Kategori     : $kategori")
        println("Berat        : $berat kg")
        if (diskon > 0) {
            val hargaDiskon = harga - (harga * diskon / 100)
            println("Diskon       : $diskon% (Harga setelah diskon: Rp ${"%.2f".format(hargaDiskon)})")
        } else {
            println("Diskon       : Tidak ada")
        }
        println("=".repeat(30))
    }
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("Berhasil membeli $jumlah unit $nama.")
            println("Sisa stok: $stok unit.")
        } else {
            println("Stok tidak mencukupi. Stok saat ini hanya $stok unit.")
        }
    }
}

fun main() {
    val produk1 = Produk(
        nama = "Laptop Gaming XYZ",
        harga = 15000000.0,
        stok = 10,
        deskripsi = "Laptop gaming dengan performa tinggi dan grafis memukau.",
        kategori = "Elektronik",
        berat = 2.5,
        diskon = 10
    )
    produk1.tampilkanInfo()
    produk1.beliProduk(3) 
    produk1.beliProduk(8) 
}
