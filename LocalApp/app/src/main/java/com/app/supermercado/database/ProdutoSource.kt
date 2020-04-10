package com.app.supermercado.database

class ProdutoSource{

    companion object{

        fun createDataSet(): ArrayList<Produtos>{
            val list = ArrayList<Produtos>()
            list.add(
                Produtos(
                    0,
                    "Cadeira",
                    59.99,
                    "Disponivel",
                    "Movel",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"


                )
            )
            list.add(
                Produtos(
                    1,
                    "Mesa",
                    59.99,
                    "Disponivel",
                    "Movel",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"


                )
            )

            list.add(
                Produtos(
                    3,
                    "Pera",
                    9.99,
                    "Disponivel",
                    "Fruta",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"

                )
            )
            list.add(
                Produtos(
                    4,
                    "Banana",
                    9.99,
                    "Disponivel",
                    "Fruta",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"

                )
            )
            list.add(
                Produtos(
                    5,
                    "Cadeira",
                    59.99,
                    "Disponivel",
                    "Movel",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"

                )
            )
            list.add(
                Produtos(
                    6,
                    "Cadeira",
                    59.99,
                    "Disponivel",
                    "Movel",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"

                )
            )
            list.add(
                Produtos(
                    7,
                    "Cadeira",
                    59.99,
                    "Disponivel",
                    "Movel",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"

                )
            )
            list.add(
                Produtos(
                    8,
                    "Cadeira",
                    59.99,
                    "Disponivel",
                    "Movel",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"

                )
            )
            list.add(
                Produtos(
                    9,
                    "Cadeira",
                    59.99,
                    "Disponivel",
                    "Movel",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png"

                )
            )
            return list
        }
    }
}