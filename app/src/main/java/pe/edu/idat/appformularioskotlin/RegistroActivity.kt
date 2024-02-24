package pe.edu.idat.appformularioskotlin

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.idat.appformularioskotlin.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun validarPreferencia(): Boolean {
        var respuesta = false
        if(binding.cbdeporte.isChecked || binding.cbmusica.isChecked || binding.cbotros.isChecked)
            respuesta = true
        return respuesta

    }
    fun validarGenero(): Boolean {
        var respuesta = true
        if(binding.rggenero.checkedRadioButtonId == -1)
            respuesta = false
        return respuesta
    }

    fun validarNombresApellidos(): Boolean {
        var respuesta = true
        if (binding.etnombre.text.toString().trim().isEmpty()) {
            binding.etnombre.isFocusableInTouchMode = true
            binding.etnombre.requestFocus()
            respuesta = false
        }else if (binding.etapellido.text.toString().trim().isEmpty()) {
            binding.etapellido.isFocusableInTouchMode = true
            binding.etapellido.requestFocus()
            respuesta = false
        }
        return respuesta
    }
}