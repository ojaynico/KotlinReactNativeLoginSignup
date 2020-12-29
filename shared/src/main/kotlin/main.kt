import components.LoginScreen
import components.SignupScreen
import ojaynico.kotlin.react.native.navigation.Navigation

fun main() {
    Navigation.registerComponent("LoginScreen") { LoginScreen::class.js }
    Navigation.registerComponent("SignupScreen") { SignupScreen::class.js }
    Navigation.setDefaultOptions(object {
        val statusBar = object {
            val backgroundColor = "purple"
        }
        val topBar = object {
            val title = object {
                val color = "white"
            }
            val backButton = object {
                val color = "white"
            }
            val background = object {
                val color = "purple"
            }
        }
    })
    Navigation.events().registerAppLaunchedListener {
        Navigation.setRoot(object {
            val root = object {
                val stack = object {
                    val children = arrayOf(
                        object {
                            val component = object {
                                val name = "LoginScreen"
                                val options = object {
                                    val topBar = object {
                                        val visible = false
                                        val drawBehind = true
                                        val animate = false
                                    }
                                }
                            }
                        }
                    )
                }
            }
        })
    }
}
