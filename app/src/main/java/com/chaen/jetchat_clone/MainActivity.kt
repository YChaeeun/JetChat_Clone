package com.chaen.jetchat_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.chaen.jetchat_clone.profile.ProfileScreen
import com.chaen.jetchat_clone.ui.theme.JetChat_CloneTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			JetChat_CloneTheme {
				ProfileScreen()
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	JetChat_CloneTheme {
		ProfileScreen()
	}
}