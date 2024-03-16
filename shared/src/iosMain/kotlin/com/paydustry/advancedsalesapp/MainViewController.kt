import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.paydustry.advancedsalesapp.composable.InitScreen

fun MainViewController() = ComposeUIViewController {
    Navigator(screen = InitScreen()) {
        SlideTransition(navigator = it)
    }
}
