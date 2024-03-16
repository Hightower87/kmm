import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.navigator.Navigator
import com.paydustry.advancedsalesapp.composable.InitScreen

fun MainViewController() = ComposeUIViewController { Navigator(screen = InitScreen()) }
