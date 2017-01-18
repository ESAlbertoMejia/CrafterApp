package com.esamdevelopers.gamej.crafterapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.esamdevelopers.gamej.crafterapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gamej on 18/1/2017.
 */

public class AdaptadorDirecciones extends RecyclerView.Adapter<AdaptadorDirecciones.ViewHolder> {

    public AdaptadorDirecciones() {
    }

    @Override
    public AdaptadorDirecciones.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.address_fragment, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorDirecciones.ViewHolder holder, int position) {
        Direcciones item = Direcciones.DIRECCIONES.get(position);
        holder.direccion.setText(item.getDireccion());
        holder.departamento.setText(item.getDepartamento());
        holder.ciudad.setText(item.getCiudad());
        holder.telefono.setText(item.getTelefono());
    }

    @Override
    public int getItemCount() {
        return Direcciones.DIRECCIONES.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView direccion, departamento, ciudad, telefono;

        public ViewHolder(View itemView) {
            super(itemView);
            direccion = (TextView) itemView.findViewById(R.id.address);
            departamento = (TextView) itemView.findViewById(R.id.state);
            ciudad = (TextView) itemView.findViewById(R.id.city);
            telefono = (TextView) itemView.findViewById(R.id.phone);
        }
    }

    public static class Direcciones {

        public String direccion;
        public String departamento;
        public String ciudad;
        public String telefono;

        public Direcciones(String direccion, String departamento, String ciudad, String telefono) {
            this.direccion = direccion;
            this.departamento = departamento;
            this.ciudad = ciudad;
            this.telefono = telefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public final static List<Direcciones> DIRECCIONES = new ArrayList<Direcciones>();

        static {
            DIRECCIONES.add(new Direcciones("Cra 24 #2C-50", "Valle", "Cali", "3459821"));
            DIRECCIONES.add(new Direcciones("Calle 100 Trans. 23", "Valle", "Cali", "4992600"));
            DIRECCIONES.add(new Direcciones("Ave. 3ra N. #20-10", "Valle", "Cali", "4400725"));
        }
    }
}