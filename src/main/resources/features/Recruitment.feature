Feature: Admin Menambahkan Data Kandidat
  # 1
  Scenario: admin dapat berhasil menambahkan data kandidat ketika semua informasi yang diperlukan disediakan dengan benar
    Given Admin telah login ke sistem
    When Admin masuk ke menu Recruitment
    And Admin memilih opsi Tambah Kandidat
    # lanjutkan
    Then Sistem menampilkan pesan sukses yang mengkonfirmasi penambahan data kandidat
    And Data kandidat ditambahkan ke sistem dengan informasi yang sesuai