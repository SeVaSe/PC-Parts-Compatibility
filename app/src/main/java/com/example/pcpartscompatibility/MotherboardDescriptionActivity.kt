package com.example.pcpartscompatibility

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MotherboardDescriptionActivity : AppCompatActivity() {
    private lateinit var textViewNameEL: TextView
    private lateinit var textViewMotherboardDescription: TextView
    private lateinit var buttonNextMotherboard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.motherboard_description)

        textViewNameEL = findViewById(R.id.textViewNameEL)
        textViewMotherboardDescription = findViewById(R.id.textViewMotherboardDescription)
        buttonNextMotherboard = findViewById(R.id.buttonNextMotherboard)

// EL1
        val componentType = intent.getStringExtra("componentType")
        when (componentType) {
            "motherboard" -> {
                textViewNameEL.text = "МАТЕРИНСКАЯ ПЛАТА"
                textViewMotherboardDescription.text = "Вы выбрали материнскую карту: ASUS ROG Strix Z590-E Gaming WiFi 6 - высококлассная материнская плата, совместимая с процессорами Intel. Поддерживает высокие частоты оперативной памяти, имеет беспроводные технологии Wi-Fi 6 и Bluetooth, разнообразные порты USB, а также поддерживает подсветку RGB для стилизации системы."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType", "processor")
                    startActivity(intent)
                }
            }
            "processor" -> {
                textViewNameEL.text = "ПРОЦЕССОР"
                textViewMotherboardDescription.text = "Вам подойдет процессор: Intel Core i5-11600K - это шестиядерный процессор 11-го поколения с разблокированным множителем. Он предназначен для игр и задач производительности. Благодаря технологии Turbo Boost, он способен автоматически увеличивать тактовую частоту для повышения производительности в требовательных приложениях."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType", "ozu")
                    startActivity(intent)
                }
            }
            "ozu" -> {
                textViewNameEL.text = "ОПЕРАТИВНАЯ ПАМЯТЬ"
                textViewMotherboardDescription.text = "Вам подойдет ОЗУ: Corsair Vengeance LPX 16GB (2 x 8GB) DDR4-3200 - представляет собой высокопроизводительные модули оперативной памяти DDR4. С тактовой частотой 3200 МГц и емкостью 16 ГБ (2 x 8 ГБ), эта память обеспечивает быстрый доступ к данным, что особенно важно для многозадачных приложений и игр."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType", "videoCard")
                    startActivity(intent)
                }
            }
            "videoCard" -> {
                textViewNameEL.text = "ВИДЕОКАРТА"
                textViewMotherboardDescription.text = "Вам подойдет видеокарта: NVIDIA GeForce RTX 3060 - мощная графическая карта с поддержкой технологии трассировки лучей (Ray Tracing) и технологии искусственного интеллекта DLSS. Она обеспечивает высокую производительность в современных играх и подходит для задач видеомонтажа и 3D-моделирования."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType", "ssd")
                    startActivity(intent)
                }
            }
            "ssd" -> {
                textViewNameEL.text = "SSD"
                textViewMotherboardDescription.text = "Вам подойдет SSD: Samsung 970 EVO Plus 500GB NVMe - высокоскоростной NVMe SSD. Скорость чтения и записи данных на высоком уровне, что обеспечивает быструю загрузку операционной системы и приложений. Емкость 500 ГБ предоставляет достаточно места для операционной системы и ключевых приложений."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType", "power")
                    startActivity(intent)
                }
            }
            "power" -> {
                textViewNameEL.text = "БЛОК ПИТАНИЯ"
                textViewMotherboardDescription.text = "Вам подойдет блок питания: EVGA SuperNOVA 650 G5, 80 Plus Gold 650W - высококачественный блок питания с эффективностью 80 Plus Gold. Он обеспечивает стабильное и надежное электропитание для всей системы, имеет модульные кабели для удобной установки и эффективное охлаждение для долгого срока службы."
                buttonNextMotherboard.setOnClickListener {
                    val assembledPCInfo = "- Процессор: Intel Core i5-11600K\n\n" +
                            "- Материнская плата: ASUS ROG Strix Z590-E Gaming WiFi 6\n\n" +
                            "- Оперативная память: Corsair Vengeance LPX 16GB (2 x 8GB) DDR4-3200\n\n" +
                            "- Графическая карта: NVIDIA GeForce RTX 3060\n\n" +
                            "- SSD: Samsung 970 EVO Plus 500GB NVMe\n\n" +
                            "- Блок питания: EVGA SuperNOVA 650 G5, 80 Plus Gold 650W"
                    val intent = Intent(this, FinishedBuildActivity::class.java)
                    intent.putExtra("assembledPCInfo", assembledPCInfo)
                    startActivity(intent)
                }
            }
            else -> {
            }
        }

// EL2
        val componentType1 = intent.getStringExtra("componentType1")
        when (componentType1) {
            "motherboard" -> {
                textViewNameEL.text = "МАТЕРИНСКАЯ ПЛАТА"
                textViewMotherboardDescription.text = "Вы выбрали материнскую карту: MSI MPG B550 Gaming Edge WiFi - мощная материнская плата для процессоров AMD AM4. Она обеспечивает высокую производительность, имеет поддержку PCIe 4.0, встроенный модуль Wi-Fi и Bluetooth, а также разнообразные порты для подключения устройств."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType1", "processor")
                    startActivity(intent)
                }
            }
            "processor" -> {
                textViewNameEL.text = "ПРОЦЕССОР"
                textViewMotherboardDescription.text = "Вам подойдет процессор: AMD Ryzen 7 5800X - восьмиядерный процессор высокой производительности от AMD с базовой частотой 3.8 ГГц и возможностью разгона. Он предназначен для многозадачных нагрузок, игр и профессиональных приложений."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType1", "ozu")
                    startActivity(intent)
                }
            }
            "ozu" -> {
                textViewNameEL.text = "ОПЕРАТИВНАЯ ПАМЯТЬ"
                textViewMotherboardDescription.text = "Вам подойдет ОЗУ: G.Skill Ripjaws V 32GB (2 x 16GB) DDR4-3600 - высокопроизводительная оперативная память DDR4. Этот комплект включает два модуля по 16 ГБ с тактовой частотой 3600 МГц, обеспечивая быстрый доступ к данным для многих задач."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType1", "videoCard")
                    startActivity(intent)
                }
            }
            "videoCard" -> {
                textViewNameEL.text = "ВИДЕОКАРТА"
                textViewMotherboardDescription.text = "Вам подойдет видеокарта: AMD Radeon RX 6700 XT - мощная графическая карта с поддержкой технологии трассировки лучей и высокой производительностью в играх. Она предоставляет возможность играть в современные игры на высоких настройках графики."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType1", "ssd")
                    startActivity(intent)
                }
            }
            "ssd" -> {
                textViewNameEL.text = "SSD"
                textViewMotherboardDescription.text = "Вам подойдет SSD: Western Digital Blue SN550 1TB NVMe - быстрый NVMe SSD с емкостью 1 ТБ. Обладает высокой скоростью чтения и записи данных, что делает его отличным выбором для операционной системы, приложений и хранения данных."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType1", "power")
                    startActivity(intent)
                }
            }
            "power" -> {
                textViewNameEL.text = "БЛОК ПИТАНИЯ"
                textViewMotherboardDescription.text = "Вам подойдет блок питания: Corsair RM750x, 80 Plus Gold 750W  - качественный блок питания с эффективностью 80 Plus Gold. Он обеспечивает стабильное и эффективное питание для всех компонентов системы, имеет модульные кабели и хорошие характеристики охлаждения."
                buttonNextMotherboard.setOnClickListener {
                    val assembledPCInfo = "- Процессор: AMD Ryzen 7 5800X\n\n" +
                            "- Материнская плата: MSI MPG B550 Gaming Edge WiFi\n\n" +
                            "- Оперативная память: G.Skill Ripjaws V 32GB (2 x 16GB) DDR4-3600\n\n" +
                            "- Графическая карта: AMD Radeon RX 6700 XT\n\n" +
                            "- SSD: Western Digital Blue SN550 1TB NVMe\n\n" +
                            "- Блок питания: Corsair RM750x, 80 Plus Gold 750W"
                    val intent = Intent(this, FinishedBuildActivity::class.java)
                    intent.putExtra("assembledPCInfo", assembledPCInfo)
                    startActivity(intent)
                }
            }
            else -> {
            }
        }

// EL3
        val componentType2 = intent.getStringExtra("componentType2")
        when (componentType2) {
            "motherboard" -> {
                textViewNameEL.text = "МАТЕРИНСКАЯ ПЛАТА"
                textViewMotherboardDescription.text = "Вы выбрали материнскую карту: ASUS ROG Strix Z690-E Gaming WiFi 6E - элитная материнская плата для процессоров Intel LGA 1700. Она поддерживает высокие частоты памяти DDR5, имеет передовые возможности подключения и включает в себя модули Wi-Fi 6E и Bluetooth для беспроводной связи."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType2", "processor")
                    startActivity(intent)
                }
            }
            "processor" -> {
                textViewNameEL.text = "ПРОЦЕССОР"
                textViewMotherboardDescription.text = "Вам подойдет процессор: Intel Core i9-12900K - мощный процессор нового поколения от Intel с архитектурой Alder Lake. Это двенадцатиядерный процессор (включая ядра P-cores и E-cores) с возможностью разгона. Он предназначен для высокопроизводительных задач, игр и многозадачности."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType2", "ozu")
                    startActivity(intent)
                }
            }
            "ozu" -> {
                textViewNameEL.text = "ОПЕРАТИВНАЯ ПАМЯТЬ"
                textViewMotherboardDescription.text = "Вам подойдет ОЗУ: Corsair Dominator Platinum RGB 32GB (4 x 8GB) DDR5-6400 - высокопроизводительная оперативная память DDR5. В комплекте 4 модуля по 8 ГБ, с тактовой частотой 6400 МГц, обеспечивая максимальную производительность системы."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType2", "videoCard")
                    startActivity(intent)
                }
            }
            "videoCard" -> {
                textViewNameEL.text = "ВИДЕОКАРТА"
                textViewMotherboardDescription.text = "Вам подойдет видеокарту: NVIDIA GeForce RTX 3080 Ti - мощная графическая карта нового поколения с поддержкой технологии трассировки лучей и DLSS. Она обеспечивает высокую производительность для игр на высоких настройках графики и профессиональных задач."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType2", "ssd")
                    startActivity(intent)
                }
            }
            "ssd" -> {
                textViewNameEL.text = "SSD"
                textViewMotherboardDescription.text = "Вам подойдет SSD: Kingston KC2500 1TB NVMe - NVMe SSD с емкостью 1 ТБ. С высокими скоростями чтения и записи, это быстрое хранилище данных для операционной системы, приложений и файлов."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType2", "power")
                    startActivity(intent)
                }
            }
            "power" -> {
                textViewNameEL.text = "БЛОК ПИТАНИЯ"
                textViewMotherboardDescription.text = "Вам подойдет блок питания: Seasonic Prime Ultra Titanium 850W, 80 Plus Titanium 850W - высокоэффективный блок питания с сертификацией 80 Plus Titanium. Он обеспечивает стабильное электропитание для всех компонентов системы, имеет высокую эффективность и надежность."
                buttonNextMotherboard.setOnClickListener {
                    val assembledPCInfo = "- Процессор: Intel Core i9-12900K\n\n" +
                            "- Материнская плата: ASUS ROG Strix Z690-E Gaming WiFi 6E\n\n" +
                            "- Оперативная память: Corsair Dominator Platinum RGB 32GB (4 x 8GB) DDR5-6400\n\n" +
                            "- Графическая карта: NVIDIA GeForce RTX 3080 Ti\n\n" +
                            "- SSD: Kingston KC2500 1TB NVMe\n\n" +
                            "- Блок питания: Seasonic Prime Ultra Titanium 850W, 80 Plus Titanium 850W"
                    val intent = Intent(this, FinishedBuildActivity::class.java)
                    intent.putExtra("assembledPCInfo", assembledPCInfo)
                    startActivity(intent)
                }
            }
            else -> {
            }
        }

// EL4
        val componentType3 = intent.getStringExtra("componentType3")
        when (componentType3) {
            "motherboard" -> {
                textViewNameEL.text = "МАТЕРИНСКАЯ ПЛАТА"
                textViewMotherboardDescription.text = "Вы выбрали материнскую карту: ASUS ROG Strix TRX40-E Gaming - материнская плата, созданная для процессоров AMD TRX4. Она предоставляет высокую пропускную способность PCIe, поддерживает большие объемы оперативной памяти и обладает множеством интерфейсов для подключения различных устройств."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType3", "processor")
                    startActivity(intent)
                }
            }
            "processor" -> {
                textViewNameEL.text = "ПРОЦЕССОР"
                textViewMotherboardDescription.text = "Вам подойдет процессор: AMD Ryzen Threadripper 3970X - высокопроизводительный процессор с 32 ядрами и 64 потоками. Это мощное решение для профессиональных задач, требующих большой многозадачности и вычислительной мощности."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType3", "ozu")
                    startActivity(intent)
                }
            }
            "ozu" -> {
                textViewNameEL.text = "ОПЕРАТИВНАЯ ПАМЯТЬ"
                textViewMotherboardDescription.text = "Вам подойдет ОЗУ: Corsair Vengeance LPX 64GB (4 x 16GB) DDR4-3200 - надежная и быстрая оперативная память DDR4. Этот комплект состоит из четырех модулей по 16 ГБ каждый с тактовой частотой 3200 МГц, обеспечивая высокую производительность при работе с большим объемом данных."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType3", "videoCard")
                    startActivity(intent)
                }
            }
            "videoCard" -> {
                textViewNameEL.text = "ВИДЕОКАРТА"
                textViewMotherboardDescription.text = "Вам подойдет видеокарта: NVIDIA Quadro RTX 5000 - профессиональная графическая карта с большой вычислительной мощностью. Она предназначена для профессиональных приложений, требующих высокой графической производительности, таких как 3D-моделирование, рендеринг и видеомонтаж."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType3", "ssd")
                    startActivity(intent)
                }
            }
            "ssd" -> {
                textViewNameEL.text = "SSD"
                textViewMotherboardDescription.text = "Вам подойдет SSD: Samsung 970 Pro 1TB NVMe - высокоскоростной NVMe SSD с емкостью 1 ТБ. Обладает высокой скоростью чтения и записи данных, обеспечивая быстрый доступ к хранимой информации."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType3", "power")
                    startActivity(intent)
                }
            }
            "power" -> {
                textViewNameEL.text = "БЛОК ПИТАНИЯ"
                textViewMotherboardDescription.text = "Вам подойдет блок питания: EVGA SuperNOVA 1000 G5, 80 Plus Gold 1000W - мощный блок питания с сертификацией 80 Plus Gold. Он обеспечивает стабильное электропитание для всех компонентов системы, включая мощные процессоры и графические карты."
                buttonNextMotherboard.setOnClickListener {
                    val assembledPCInfo = "- Процессор: AMD Ryzen Threadripper 3970X\n\n" +
                            "- Материнская плата: ASUS ROG Strix TRX40-E Gaming\n\n" +
                            "- Оперативная память: Corsair Vengeance LPX 64GB (4 x 16GB) DDR4-3200\n\n" +
                            "- Графическая карта: NVIDIA Quadro RTX 5000\n\n" +
                            "- SSD: Samsung 970 Pro 1TB NVMe\n\n" +
                            "- Блок питания: EVGA SuperNOVA 1000 G5, 80 Plus Gold 1000W"
                    val intent = Intent(this, FinishedBuildActivity::class.java)
                    intent.putExtra("assembledPCInfo", assembledPCInfo)
                    startActivity(intent)
                }
            }
            else -> {
            }
        }

// EL5
        val componentType4 = intent.getStringExtra("componentType4")
        when (componentType4) {
            "motherboard" -> {
                textViewNameEL.text = "МАТЕРИНСКАЯ ПЛАТА"
                textViewMotherboardDescription.text = "Вы выбрали материнскую карту: ASRock B460M-HDV - это материнская плата форм-фактора Micro-ATX для процессоров Intel LGA 1200. Она предоставляет базовый набор функций для построения простой и надежной системы."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType4", "processor")
                    startActivity(intent)
                }
            }
            "processor" -> {
                textViewNameEL.text = "ПРОЦЕССОР"
                textViewMotherboardDescription.text = "Вам подойдет процессор: Intel Core i3-10100 - это процессор с четырьмя ядрами и восемью потоками. Он предназначен для выполнения повседневных задач, таких как интернет-серфинг, офисные приложения и базовые игры."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType4", "ozu")
                    startActivity(intent)
                }
            }
            "ozu" -> {
                textViewNameEL.text = "ОПЕРАТИВНАЯ ПАМЯТЬ"
                textViewMotherboardDescription.text = "Вам подойдет ОЗУ: Crucial Ballistix 8GB (2 x 4GB) DDR4-2666 - это комплект оперативной памяти DDR4 объемом 8 ГБ (2 модуля по 4 ГБ). С тактовой частотой 2666 МГц, он обеспечивает базовую производительность для повседневных задач."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType4", "videoCard")
                    startActivity(intent)
                }
            }
            "videoCard" -> {
                textViewNameEL.text = "ВИДЕОКАРТА"
                textViewMotherboardDescription.text = "Вам подойдет видеокарта: NVIDIA GeForce GTX 1650 - это видеокарта среднего уровня, предназначенная для игр средней сложности и выполнения основных графических задач. Она обеспечивает умеренную графическую производительность."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType4", "ssd")
                    startActivity(intent)
                }
            }
            "ssd" -> {
                textViewNameEL.text = "SSD"
                textViewMotherboardDescription.text = "Вам подойдет SSD: Kingston A2000 256GB NVMe - это NVMe SSD с небольшой емкостью 256 ГБ. Скорость чтения/записи высокая, что позволяет быстро загружать операционную систему и приложения."
                buttonNextMotherboard.setOnClickListener {
                    val intent = Intent(this, MotherboardDescriptionActivity::class.java)
                    intent.putExtra("componentType4", "power")
                    startActivity(intent)
                }
            }
            "power" -> {
                textViewNameEL.text = "БЛОК ПИТАНИЯ"
                textViewMotherboardDescription.text = "Вам подойдет блок питания: EVGA 500 W1, 80 Plus 500W - это блок питания мощностью 500 Вт с сертификацией 80 Plus. Он предоставляет базовое электропитание для компонентов системы и хороший выбор для небольших бюджетных сборок."
                buttonNextMotherboard.setOnClickListener {
                    val assembledPCInfo = "- Процессор: Intel Core i3-10100\n\n" +
                            "- Материнская плата: ASRock B460M-HDV\n\n" +
                            "- Оперативная память: Crucial Ballistix 8GB (2 x 4GB) DDR4-2666\n\n" +
                            "- Графическая карта: NVIDIA GeForce GTX 1650\n\n" +
                            "- SSD: Kingston A2000 256GB NVMe\n\n" +
                            "- Блок питания: EVGA 500 W1, 80 Plus 500W"
                    val intent = Intent(this, FinishedBuildActivity::class.java)
                    intent.putExtra("assembledPCInfo", assembledPCInfo)
                    startActivity(intent)
                }
            }
            else -> {
            }
        }
    }
}



