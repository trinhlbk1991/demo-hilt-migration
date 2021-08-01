package com.icedtealabs.demohiltmigration.feature.componentinjection

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.icedtealabs.demohiltmigration.App
import com.icedtealabs.demohiltmigration.databinding.FragmentProfileBinding
import com.icedtealabs.demohiltmigration.feature.dashboard.LoadProfileUseCase
import com.icedtealabs.demohiltmigration.repository.AccountRepository
import javax.inject.Inject


class DemoActivity : AppCompatActivity() {

    @Inject
    lateinit var accountRepository: AccountRepository

    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = FragmentProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        App.instance().component().inject(this)

        accountRepository.loadProfile().observe(this) {
            binding.imgAvatar.setImageResource(it.avatar)
            binding.tvUser.text = it.username
        }
    }

}
