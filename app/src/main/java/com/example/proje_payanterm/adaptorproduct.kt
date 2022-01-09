package com.example.proje_payanterm

class adaptorproduct {
    package com.example.test

    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView

    import androidx.appcompat.view.menu.MenuView
    import androidx.recyclerview.widget.RecyclerView
    import com.squareup.picasso.Picasso

    class Adapterproduct(private val data:List<ModelProduct>) : RecyclerView.Adapter<Adapterproduct.ViewHolder>(){

        class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
            val item_pic_pro=itemView.findViewById<ImageView>(R.id.item_ir_product)
            val txt_name=itemView.findViewById<TextView>(R.id.txr_produt_name)
            val txt_price=itemView.findViewById<TextView>(R.id.item_txt_product_price)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view=LayoutInflater.from(parent.context).inflate(R.layout.item_prodect,parent,false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.txt_name.text=data[position].name
            holder.txt_price.text=data[position].price.toString()
            Picasso.get().load(data[position].pic).into(holder.item_pic_pro)

        }

        override fun getItemCount(): Int {
            return data.size
        }
    }
}