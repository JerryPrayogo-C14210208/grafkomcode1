import Engine.*;
import Engine.Object;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;

public class Main {
    private Window window = new Window(1080,1080,"Proyek Grafkom");
    private ArrayList<Object> objects
            = new ArrayList<>();

    private MouseInput mouseInput;
    float looptime = 0f;
    float looptime1 = 0;
    float looptime2 = 0f;
    float looptime3 = 0f;
    float looptime4 = 0f;
    float looptime5 = 0f;
    float looptime6 = 0f;
    float looptime7 = 0f;
    float looptimew = 0f;
    float looptime8 = 0f;
    float looptime9 = 0f;
    float looptime10= 0f;
    float looptime11 = 0f;
    float looptimed = 0f;
    float looptime12 = 0f;
    float looptime13= 0f;
    float looptime14= 0f;

    int countDegree = 0;
    Projection projection = new Projection(window.getWidth(),window.getHeight());
    Camera camera = new Camera();
    public void init() {
        window.init();
        GL.createCapabilities();
        mouseInput = window.getMouseInput();
        camera.setPosition(1.8f, -1, -2f);
        camera.setRotation((float) Math.toRadians(0.0f), (float) Math.toRadians(180));
        //code
        //badan
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.0f, 0.0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));

        objects.get(0).translateObject(0f, 0f, 0.0f);
        objects.get(0).scaleObject(5f, 5.2f, 5f);
// MATA KIRI
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(0).getChildObject().get(0).translateObject(-0.1f, 0.0f, 2.05f);
        objects.get(0).getChildObject().get(0).scaleObject(0.9f, 0.9f, 0.3f);
        objects.get(0).getChildObject().get(0).setCenterPoint(Arrays.asList(0.0f, 0.0f, 0.0f));
//MATA KANAN
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(0).getChildObject().get(1).translateObject(0.16f, 0.0f, 2.05f);
        objects.get(0).getChildObject().get(1).scaleObject(0.9f, 0.9f, 0.3f);

////BOLA MATA KIRI
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(0).getChildObject().get(2).translateObject(-0.2f, 0.0f, 4.3f);
        objects.get(0).getChildObject().get(2).scaleObject(0.25f, 0.25f, 0.15f);


//BOLA MATA KANAN
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(0).getChildObject().get(3).translateObject(0.37f, 0.0f, 4.3f);
        objects.get(0).getChildObject().get(3).scaleObject(0.25f, 0.25f, 0.15f);

//ALIS KIRI
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                3
        ));
        objects.get(0).getChildObject().get(4).translateObject(-0.07f, 0.1f, 2.2f);
        objects.get(0).getChildObject().get(4).scaleObject(2f, 0.5f, 0.3f);
        objects.get(0).getChildObject().get(4).rotateObject((float) Math.toRadians(-25f), 0f, 0f, 1.f);
//
//ALIS KANAN
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                3
        ));
        objects.get(0).getChildObject().get(5).translateObject(0.09f, 0.06f, 2.2f);
        objects.get(0).getChildObject().get(5).scaleObject(2f, 0.5f, 0.3f);
        objects.get(0).getChildObject().get(5).rotateObject((float) Math.toRadians(25f), 0f, 0f, 1f);
//BELAKANG EKOR TENGAH
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                5
        ));
        objects.get(0).getChildObject().get(6).translateObject(0.0f, 0.22f, -0.2f);
        objects.get(0).getChildObject().get(6).scaleObject(0.6f, 3.2f, 0.7f);
        objects.get(0).getChildObject().get(6).rotateObject((float) Math.toRadians(-90f), 1f, 0f, 0.0f);
///BELAKANG EKOR ATAS
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                5
        ));
        objects.get(0).getChildObject().get(7).translateObject(0.0f, 0.23f, -0.47f);
        objects.get(0).getChildObject().get(7).scaleObject(0.3f, 2.5f, 0.7f);
        objects.get(0).getChildObject().get(7).rotateObject((float) Math.toRadians(-60f), 1f, 0f, 0.0f);
//BELAKANG EKOR BAWAH
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                5
        ));
        objects.get(0).getChildObject().get(8).translateObject(0.0f, 0.27f, 0.1f);
        objects.get(0).getChildObject().get(8).scaleObject(0.3f, 2.5f, 0.7f);
        objects.get(0).getChildObject().get(8).rotateObject((float) Math.toRadians(-120f), 1f, 0f, 0.0f);
//PARUH ATAS
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.95f, 0.95f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                4
        ));
        objects.get(0).getChildObject().get(9).translateObject(0.008f, 0.34f, 0.02f);
        objects.get(0).getChildObject().get(9).scaleObject(2.2f, 2.2f, 2f);
        objects.get(0).getChildObject().get(9).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
        objects.get(0).getChildObject().get(9).rotateObject((float) Math.toRadians(1f), 0f, 1f, 0f);
//        PARUH BAWAH
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.88f, 0.88f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                4
        ));
        objects.get(0).getChildObject().get(10).translateObject(-0.013f, 0.39f, -0.23f);
        objects.get(0).getChildObject().get(10).scaleObject(2f, 1.85f, 1f);
        objects.get(0).getChildObject().get(10).rotateObject((float) Math.toRadians(180f), 0f, 1f, 0f);
        objects.get(0).getChildObject().get(10).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
//TOPI TOPI TABUNG
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 1.f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                400,
                7
        ));
        objects.get(0).getChildObject().get(11).translateObject(0.0f, 0.0f, -0.4f);
        objects.get(0).getChildObject().get(11).scaleObject(4.2f, 4.2f, 1f);
        objects.get(0).getChildObject().get(11).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
//TOPI CONE
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 0f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                400,
                6
        ));
        objects.get(0).getChildObject().get(12).translateObject(0.0f, 0f, -1.65f);
        objects.get(0).getChildObject().get(12).scaleObject(0.59f, 0.59f, 0.59f);
        objects.get(0).getChildObject().get(12).rotateObject((float) Math.toRadians(90f), 1f, 0f, 0f);
//TOPI LINGKARAN
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 1f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                400,
                1
        ));
        objects.get(0).getChildObject().get(13).translateObject(0.0f, 1.05f, 0f);
        objects.get(0).getChildObject().get(13).scaleObject(1f, 1f, 1f);

//        RAMBUT ATAS
        objects.get(0).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.9f, 0f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(0).getChildObject().get(14).translateObject(0.0f, 0.55f, -0.2f);
        objects.get(0).getChildObject().get(14).scaleObject(0.8f, 1f, 1.8f);
        objects.get(0).getChildObject().get(14).rotateObject((float) Math.toRadians(35f), 1f, 0f, 0f);

//KODE NICO
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.85f, 0.95f, 0.98f, 1.0f), // rgb(185, 233, 252)
                Arrays.asList(-0f, -0f, 0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                3
        ));
        objects.get(1).translateObject(-0f, -0f, 0f);
        objects.get(1).scaleObject(5f, 5f, 5f);

        //mata
        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 1f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                1
        ));
        objects.get(1).getChildObject().get(0).translateObject(-0.13f, 0.15f, 1.0f);
        objects.get(1).getChildObject().get(0).scaleObject(0.5f, 0.5f, 0.3f);

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1f, 1f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                1
        ));
        objects.get(1).getChildObject().get(1).translateObject(0.13f, 0.15f, 1.0f);
        objects.get(1).getChildObject().get(1).scaleObject(0.5f, 0.5f, 0.3f);

        //bola mata
        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                1
        ));
        objects.get(1).getChildObject().get(2).translateObject(0.28f, 0.4f, 3.3f);
        objects.get(1).getChildObject().get(2).scaleObject(0.15f, 0.15f, 0.1f);

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                1
        ));
        objects.get(1).getChildObject().get(3).translateObject(-0.28f, 0.4f, 3.3f);
        objects.get(1).getChildObject().get(3).scaleObject(0.15f, 0.15f, 0.1f);

        //jambul
        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.85f, 0.95f, 0.98f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                5
        ));
        objects.get(1).getChildObject().get(4).translateObject(0.0f, 0.18f, 0f);
        objects.get(1).getChildObject().get(4).scaleObject(0.7f, 3.6f, 0.6f);
        objects.get(1).getChildObject().get(4).rotateObject(0.8f, 0.3f, 0.0f, 0.0f);

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.85f, 0.95f, 0.98f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                5
        ));
        objects.get(1).getChildObject().get(5).translateObject(0.0f, 0.14f, 0.25f);
        objects.get(1).getChildObject().get(5).scaleObject(0.7f, 3.6f, 0.6f);
        objects.get(1).getChildObject().get(5).rotateObject(0.8f, -0.3f, 0.0f, 0.0f);

        //ekor
        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.85f, 0.95f, 0.98f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                5
        ));
        objects.get(1).getChildObject().get(6).translateObject(0.0f, 0.11f, -0.32f);
        objects.get(1).getChildObject().get(6).scaleObject(0.4f, 3.6f, 0.6f);
        objects.get(1).getChildObject().get(6).rotateObject(1f, -0.8f, 0.0f, 0.0f);

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.85f, 0.95f, 0.98f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                5
        ));
        objects.get(1).getChildObject().get(7).translateObject(0.0f, 0.13f, -0.28f);
        objects.get(1).getChildObject().get(7).scaleObject(0.4f, 3.6f, 0.6f);
        objects.get(1).getChildObject().get(7).rotateObject(1.5f, -0.8f, 0.0f, 0.0f);

        //paruh
        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 0.6f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                8
        ));
        objects.get(1).getChildObject().get(8).rotateObject(3.15f, 0f, 0.8f, -0.03f);
        objects.get(1).getChildObject().get(8).scaleObject(2.4f, 4.2f, 3f);
        objects.get(1).getChildObject().get(8).translateObject(0f, -0.005f, 0.48f);

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 0.6f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                2
        ));
        objects.get(1).getChildObject().get(9).translateObject(0.0025f, 0.15f, -0.23f);
        objects.get(1).getChildObject().get(9).scaleObject(2f, 2.7f, 0.8f);
        objects.get(1).getChildObject().get(9).rotateObject(3.15f, 0f, 0.8f, 0.75f);

        //ALIS

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.77f, 0.25f, 0.25f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                5
        ));
        objects.get(1).getChildObject().get(10).translateObject(0.36f, 0.1f, 3.0f);
        objects.get(1).getChildObject().get(10).scaleObject(0.4f, 1.6f, 0.15f);
        objects.get(1).getChildObject().get(10).rotateObject(45.3f, 0f, 0.0f, 0.8f);

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.77f, 0.25f, 0.25f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                5
        ));
        objects.get(1).getChildObject().get(11).translateObject(-0.36f, 0.1f, 3.0f);
        objects.get(1).getChildObject().get(11).scaleObject(0.4f, 1.6f, 0.15f);
        objects.get(1).getChildObject().get(11).rotateObject(45.3f, 0f, 0.0f, -0.8f);

        //trophy
        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 0.95f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                6
        ));
        objects.get(1).getChildObject().get(12).translateObject(-1.83f, 1.78f, -3.92f);
        objects.get(1).getChildObject().get(12).scaleObject(0.1f, 0.1f, 0.1f);
        objects.get(1).getChildObject().get(12).rotateObject((float) Math.toRadians(90f), 1f, 0.0f, 0.0f);

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 0.95f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                7
        ));
        objects.get(1).getChildObject().get(13).translateObject(-0.9f, 0.9f, -0.35f);
        objects.get(1).getChildObject().get(13).scaleObject(0.2f, 0.2f, 1f);
        objects.get(1).getChildObject().get(13).rotateObject((float) Math.toRadians(90f), 1f, 0.0f, 0.0f);

        objects.get(1).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 0.95f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                110,
                100,
                9
        ));
        objects.get(1).getChildObject().get(14).translateObject(0.42f, 0.3f, 0.3f);
        objects.get(1).getChildObject().get(14).scaleObject(0.9f, 0.6f, 0.6f);
        objects.get(1).getChildObject().get(14).rotateObject((float) Math.toRadians(90f), 0f, 0f, 1f);
// KODE JP
        //  KEPALA
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.9f, 0.9f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.185f,
                0.185f,
                0.185f,
                36,
                18,
                4
        ));
        objects.get(2).translateObject(0.0f, 0.0f, 0.0f);
        objects.get(2).scaleObject(5f, 5f, 5f);
// MATA KIRI
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(2).getChildObject().get(0).translateObject(-0.12f, 0.0f, 1.9f);
        objects.get(2).getChildObject().get(0).scaleObject(0.9f, 0.9f, 0.25f);
        objects.get(2).getChildObject().get(0).setCenterPoint(Arrays.asList(0.0f, 0.0f, 0.0f));
//MATA KANAN
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(2).getChildObject().get(1).translateObject(0.12f, 0.0f, 1.9f);
        objects.get(2).getChildObject().get(1).scaleObject(0.9f, 0.9f, 0.25f);


////BOLA MATA KIRI
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(2).getChildObject().get(2).translateObject(-0.4f, 0.0f, 3.4f);
        objects.get(2).getChildObject().get(2).scaleObject(0.2f, 0.2f, 0.15f);


//BOLA MATA KANAN
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(2).getChildObject().get(3).translateObject(0.4f, 0.0f, 3.4f);
        objects.get(2).getChildObject().get(3).scaleObject(0.2f, 0.2f, 0.15f);

//ALIS KIRI
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.4f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                3
        ));
        objects.get(2).getChildObject().get(4).translateObject(-0.09f, 0.14f, -0.5f);
        objects.get(2).getChildObject().get(4).scaleObject(1.5f, 0.6f, -1f);
        objects.get(2).getChildObject().get(4).rotateObject((float) Math.toRadians(20f), 0f, 0f, -0.7f);
//
//ALIS KANAN
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.4f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                3
        ));
        objects.get(2).getChildObject().get(5).translateObject(0.09f, 0.14f, -0.5f);
        objects.get(2).getChildObject().get(5).scaleObject(1.5f, 0.6f, -1f);
        objects.get(2).getChildObject().get(5).rotateObject((float) Math.toRadians(20f), 0f, 0f, 0.7f);
//BELAKANG EKOR
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                3
        ));
        objects.get(2).getChildObject().get(6).translateObject(0f, -0.4f, 0f);
        objects.get(2).getChildObject().get(6).scaleObject(2f, 0.7f, -0.6f);
        objects.get(2).getChildObject().get(6).rotateObject((float) Math.toRadians(90f), 0f, 1f, 0.f);
        //BELAKANG EKOR
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                3
        ));
        objects.get(2).getChildObject().get(7).translateObject(-0.037f, -0.2f, 0f);
        objects.get(2).getChildObject().get(7).scaleObject(2f, 0.7f, -0.6f);
        objects.get(2).getChildObject().get(7).rotateObject((float) Math.toRadians(90f), 0f, 1f, 0.f);
        objects.get(2).getChildObject().get(7).rotateObject((float) Math.toRadians(10f), 1f, 0f, 0.f);


//RAMBUT KEPALA
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                3
        ));
        objects.get(2).getChildObject().get(8).translateObject(+0.29f, 1.14f, 0f);
        objects.get(2).getChildObject().get(8).scaleObject(1.f, 0.5f, -0.2f);
        objects.get(2).getChildObject().get(8).rotateObject((float) Math.toRadians(90f), 0f, 1f, 0.f);
        objects.get(2).getChildObject().get(8).rotateObject((float) Math.toRadians(70f), 1f, 0f, 0.f);
        //RAMBUT KEPALA
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                3
        ));
        objects.get(2).getChildObject().get(9).translateObject(-0.11f, 1.1f, 0f);
        objects.get(2).getChildObject().get(9).scaleObject(1.03f, 0.5f, -0.2f);
        objects.get(2).getChildObject().get(9).rotateObject((float) Math.toRadians(90f), 0f, 1f, 0.f);
        objects.get(2).getChildObject().get(9).rotateObject((float) Math.toRadians(30f), 1f, 0f, 0.f);

//  mulut atas
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.9f, 0.3f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.185f,
                0.185f,
                0.185f,
                36,
                18,
                4
        ));
        objects.get(2).getChildObject().get(10).translateObject(0.0f, -0.13f, -0.247f);
        objects.get(2).getChildObject().get(10).scaleObject(1f, 1f, 3f);
        objects.get(2).getChildObject().get(10).rotateObject((float) Math.toRadians(180f), 0.0f, 1.0f, 0.0f);

//mulut bawah
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.7f, 0.3f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.035f,
                0.015f,
                0.085f,
                36,
                18,
                2
        ));
        objects.get(2).getChildObject().get(11).translateObject(0.0f, 0.051f, -0.1353f);
        objects.get(2).getChildObject().get(11).scaleObject(5f, 5f, 4f);
        objects.get(2).getChildObject().get(11).rotateObject((float) Math.toRadians(180f), 0.0f, 1.0f, 0.0f);
        objects.get(2).getChildObject().get(11).rotateObject((float) Math.toRadians(180f), 0.0f, 0.0f, 1.0f);


        //MATA KANAN
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(2).getChildObject().get(12).translateObject(0.11f, 0.0f, 1.8f);
        objects.get(2).getChildObject().get(12).scaleObject(1.1f, 1.1f, 0.25f);

        // MATA KIRI
        objects.get(2).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(2).getChildObject().get(13).translateObject(-0.11f, 0.0f, 1.8f);
        objects.get(2).getChildObject().get(13).scaleObject(1.1f, 1.1f, 0.25f);
        objects.get(2).getChildObject().get(13).setCenterPoint(Arrays.asList(0.0f, 0.0f, 0.0f));


        objects.get(1).translateObject(-1.75f, -0.78f, 0f);
        objects.get(2).translateObject(1.8f, -1.08f, -0.35f);

        //Podium
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 1f, 0.f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                18,
                3
        ));
        objects.get(3).translateObject(.0f, -2.33f, 0f);
        objects.get(3).scaleObject(500f, 1f, 500f);

        //MEJA NO 1

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(0).translateObject(-0.0f, -0.68f, 0f);
        objects.get(3).getChildObject().get(0).scaleObject(14f, 1.2f, 14f);

        //MEJA NO 2

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(1).translateObject(-0.125f, -0.98f, 0f);
        objects.get(3).getChildObject().get(1).scaleObject(14f, 1.2f, 14f);

        //MEJA NO 3

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(2).translateObject(0.125f, -1.36f, 0f);
        objects.get(3).getChildObject().get(2).scaleObject(14f, 1.2f, 14f);

        //KAKI MEJA NO 1

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(3).translateObject(-0.37f, -0.128f, 0.37f);
        objects.get(3).getChildObject().get(3).scaleObject(2f, 12f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(4).translateObject(0.37f, -0.128f, 0.37f);
        objects.get(3).getChildObject().get(4).scaleObject(2f, 12f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(5).translateObject(0.37f, -0.128f, -0.37f);
        objects.get(3).getChildObject().get(5).scaleObject(2f, 12f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(6).translateObject(-0.37f, -0.128f, -0.37f);
        objects.get(3).getChildObject().get(6).scaleObject(2f, 12f, 2f);

        //KAKI MEJA 2

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(7).translateObject(-1.25f, -0.195f, 0.375f);
        objects.get(3).getChildObject().get(7).scaleObject(2f, 9f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(8).translateObject(-0.5f, -0.195f, 0.375f);
        objects.get(3).getChildObject().get(8).scaleObject(2f, 9f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(9).translateObject(-0.5f, -0.195f, -0.375f);
        objects.get(3).getChildObject().get(9).scaleObject(2f, 9f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(10).translateObject(-1.25f, -0.195f, -0.375f);
        objects.get(3).getChildObject().get(10).scaleObject(2f, 9f, 2f);

        //KAKI MEJA 3

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(11).translateObject(1.25f, -0.325f, 0.375f);
        objects.get(3).getChildObject().get(11).scaleObject(2f, 6f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(12).translateObject(1.25f, -0.325f, -0.375f);
        objects.get(3).getChildObject().get(12).scaleObject(2f, 6f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(13).translateObject(0.5f, -0.325f, 0.375f);
        objects.get(3).getChildObject().get(13).scaleObject(2f, 6f, 2f);

        objects.get(3).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.38f, 0.19f, 0.035f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(3).getChildObject().get(14).translateObject(0.5f, -0.325f, -0.375f);
        objects.get(3).getChildObject().get(14).scaleObject(2f, 6f, 2f);
//KODE NATAN
//        KEPALA
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.8f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.133f,
                0.125f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(4).translateObject(0.0f, 0.0f, 0.0f);
        objects.get(4).scaleObject(5f, 5f, 5f);
// MATA KIRI
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.100f,
                0.100f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(0).translateObject(-0.3f, 0.0f, 0.90f);
        objects.get(4).getChildObject().get(0).scaleObject(0.9f, 0.9f, 0.63f);
        objects.get(4).getChildObject().get(0).setCenterPoint(Arrays.asList(0.0f, 0.0f, 0.0f));
//MATA KANAN
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.100f,
                0.100f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(1).translateObject(0.4f, 0.0f, 0.80f);
        objects.get(4).getChildObject().get(1).scaleObject(0.9f, 0.9f, 0.63f);

////BOLA MATA KIRI
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.065f,
                0.065f,
                0.025f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(2).translateObject(-0.71f, 0.0f, 2.15f);
        objects.get(4).getChildObject().get(2).scaleObject(0.38f, 0.38f, 0.3f);


//BOLA MATA KANAN
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.065f,
                0.065f,
                0.025f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(3).translateObject(0.9f, 0.0f, 1.95f);
        objects.get(4).getChildObject().get(3).scaleObject(0.38f, 0.38f, 0.3f);

//ALIS KIRI
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.5f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.005f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(4).getChildObject().get(4).translateObject(-0.33f, 0.55f, -0.50f);
        objects.get(4).getChildObject().get(4).scaleObject(1.0f, 0.6f, -1f);
        objects.get(4).getChildObject().get(4).rotateObject((float) Math.toRadians(20f), 0f, 0f, 0.4f);
//
//ALIS KANAN
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.5f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.005f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(4).getChildObject().get(5).translateObject(0.30f, 0.5f, -0.5f);
        objects.get(4).getChildObject().get(5).scaleObject(1f, 0.6f, -1f);
        objects.get(4).getChildObject().get(5).rotateObject((float) Math.toRadians(20f), -0.2f, 0.3f, -0.4f);

//BELAKANG RAMBUT
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(4).getChildObject().get(6).translateObject(0f, 0.0f, 0.688f);
        objects.get(4).getChildObject().get(6).scaleObject(2f, 0.7f, -1f);
        objects.get(4).getChildObject().get(6).rotateObject((float) Math.toRadians(20f), 1f, 0f, 0.f);

        // Hidung
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 1.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.185f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(7).translateObject(0.f, -0.0f, 1.0f);
        objects.get(4).getChildObject().get(7).scaleObject(1.2f, 0.9f, 0.63f);
        objects.get(4).getChildObject().get(7).rotateObject((float) Math.toRadians(20f), 0.0f, 0.0f, -0.4f);
        //bola hidung 1
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(-0.4f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.02f,
                0.04f,
                0.01f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(8).translateObject(0.05f, -0.0f, 1.12f);
        objects.get(4).getChildObject().get(8).scaleObject(1.2f, 0.9f, 0.63f);
        //bola hidung 2
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(-0.4f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.02f,
                0.04f,
                0.01f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(9).translateObject(-0.05f, -0.0f, 1.12f);
        objects.get(4).getChildObject().get(9).scaleObject(1.2f, 0.9f, 0.63f);

        // telinga kiri
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.9f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.175f,
                0.175f,
                0.175f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(10).translateObject(-0.8f, 1.3f, 1f);
        objects.get(4).getChildObject().get(10).scaleObject(0.38f, 0.38f, 0.3f);
        // telinga kanan
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.9f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.175f,
                0.175f,
                0.175f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(11).translateObject(0.2f, 1.5f, 1f);
        objects.get(4).getChildObject().get(11).scaleObject(0.38f, 0.38f, 0.3f);
        // telinga kiri hitam dalam
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.090f,
                0.090f,
                0.090f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(12).translateObject(-0.77f, 1.275f, 1.13f);
        objects.get(4).getChildObject().get(12).scaleObject(0.38f, 0.38f, 0.3f);
        //Telinga kanan hitam dalam
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.090f,
                0.090f,
                0.090f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(13).translateObject(0.2f, 1.46f, 1.12f);
        objects.get(4).getChildObject().get(13).scaleObject(0.38f, 0.38f, 0.3f);
        // mulut
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.9f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.105f,
                0.105f,
                0.105f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(14).translateObject(0.f, -0.06f, 0.94f);
        objects.get(4).getChildObject().get(14).scaleObject(1.2f, 0.9f, 0.63f);


        //mulut 2
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.5f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.075f,
                0.075f,
                0.075f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(15).translateObject(0.f, -0.08f, 0.99f);
        objects.get(4).getChildObject().get(15).scaleObject(1.2f, 0.8f, 0.63f);


        // CURVE Helm
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.663f, 0.596f, 0.494f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.225f,
                0.125f,
                36,
                500,
                8
        ));
        objects.get(4).getChildObject().get(16).translateObject(0.0f, 0.2f, 1.0f);
        objects.get(4).getChildObject().get(16).scaleObject(8.0f, 2.7f, -0f);
        objects.get(4).getChildObject().get(16).rotateObject((float) Math.toRadians(20f), 1f, 0f, 0.f);

        // shield 1
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.663f, 0.596f, 0.494f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.1542f,
                0.165f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(4).getChildObject().get(17).translateObject(-0.15f, 0.01f, -8.0f);
        objects.get(4).getChildObject().get(17).scaleObject(4.0f, 4f, 0.08f);
        objects.get(4).getChildObject().get(17).rotateObject((float) Math.toRadians(180f), 1.0f, 0.0f, 0.2f);

        // shield 2
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.663f, 0.596f, 0.494f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.155f,
                0.225f,
                0.125f,
                36,
                500,
                10
        ));
        objects.get(4).getChildObject().get(18).translateObject(-0.15f, 0.09f, -8.0f);
        objects.get(4).getChildObject().get(18).scaleObject(4.0f, 4f, 0.08f);
        objects.get(4).getChildObject().get(18).rotateObject((float) Math.toRadians(180f), 1.0f, 0.0f, 0.2f);

        //shield 3
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.545f, 0.271f, 0.075f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.1442f,
                0.155f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(4).getChildObject().get(19).translateObject(-0.15f, 0.01f, -8.01f);
        objects.get(4).getChildObject().get(19).scaleObject(4.0f, 4f, 0.08f);
        objects.get(4).getChildObject().get(19).rotateObject((float) Math.toRadians(180f), 1.0f, 0.0f, 0.2f);

        //shield 4
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.545f, 0.271f, 0.075f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.140f,
                0.210f,
                0.125f,
                36,
                500,
                10
        ));
        objects.get(4).getChildObject().get(20).translateObject(-0.15f, 0.09f, -8.01f);
        objects.get(4).getChildObject().get(20).scaleObject(4.0f, 4f, 0.08f);
        objects.get(4).getChildObject().get(20).rotateObject((float) Math.toRadians(180f), 1.0f, 0.0f, 0.2f);

        // logo tameng
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.663f, 0.596f, 0.494f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.140f,
                0.210f,
                0.125f,
                36,
                500,
                4
        ));
        objects.get(4).getChildObject().get(21).translateObject(-0.148f, 0.09f, -7.3f);
        objects.get(4).getChildObject().get(21).scaleObject(4.0f, 4f, 0.09f);
        objects.get(4).getChildObject().get(21).rotateObject((float) Math.toRadians(180f), 1.0f, 0.0f, 0.2f);
        //pedang
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.140f,
                0.210f,
                0.125f,
                36,
                500,
                4
        ));
        objects.get(4).getChildObject().get(22).translateObject(0.6f, 0.49f, 5.5f);
        objects.get(4).getChildObject().get(22).scaleObject(0.9f, 0.9f, 0.09f);
        objects.get(4).getChildObject().get(22).rotateObject((float) Math.toRadians(45f), 1.0f, 0.0f, 0.0f);
        //pedang 2
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.136f,
                0.510f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(4).getChildObject().get(23).translateObject(0.6f, 0.15f, 5.5f);
        objects.get(4).getChildObject().get(23).scaleObject(0.9f, 0.9f, 0.09f);
        objects.get(4).getChildObject().get(23).rotateObject((float) Math.toRadians(45f), 1.0f, 0.0f, 0.0f);
        //pedang 3
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.336f,
                0.110f,
                0.025f,
                36,
                500,
                3
        ));
        objects.get(4).getChildObject().get(24).translateObject(0.6f, -0.08f, 5.5f);
        objects.get(4).getChildObject().get(24).scaleObject(0.9f, 0.9f, 0.09f);
        objects.get(4).getChildObject().get(24).rotateObject((float) Math.toRadians(45f), 1.0f, 0.0f, 0.0f);
        //pedang 4
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.065f,
                0.210f,
                0.025f,
                36,
                500,
                3
        ));
        objects.get(4).getChildObject().get(25).translateObject(0.6f, -0.2f, 5.5f);
        objects.get(4).getChildObject().get(25).scaleObject(0.9f, 0.9f, 0.09f);
        objects.get(4).getChildObject().get(25).rotateObject((float) Math.toRadians(45f), 1.0f, 0.0f, 0.0f);
        // object buff wajah
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.100f,
                0.100f,
                0.025f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(26).translateObject(-0.0f, 0.8f, 0.35f);
        objects.get(4).getChildObject().get(26).scaleObject(0.9f, 0.9f, 0.63f);
        objects.get(4).getChildObject().get(26).setCenterPoint(Arrays.asList(0.0f, 0.0f, 0.0f));
        // bola mata tengah
        objects.get(4).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.5f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.065f,
                0.065f,
                0.025f,
                36,
                500,
                1
        ));
        objects.get(4).getChildObject().get(27).translateObject(-0.0f, 0.8f, 0.37f);
        objects.get(4).getChildObject().get(27).scaleObject(0.9f, 0.9f, 0.63f);
        objects.get(4).getChildObject().get(27).setCenterPoint(Arrays.asList(0.0f, 0.0f, 0.0f));

        objects.get(4).translateObject(9f, 3.1f, 0f);

//        BALOK ATAS
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.65f,
                0.05f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).translateObject(1f, 0.95f, 0.0f);
        objects.get(5).scaleObject(5f, 5f, 5f);
//BALOK BAWAH
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.65f,
                0.05f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(0).translateObject(1.0f, 0.45f, 0.0f);
        objects.get(5).getChildObject().get(0).scaleObject(5f, 5f, 5f);
//BALOK KANAN
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.05f,
                1.10f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(1).translateObject(1.25f, 0.4f, 0.0f);
        objects.get(5).getChildObject().get(1).scaleObject(5f, 5f, 5f);

        //BALOK KIRI
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f,0.4f,0.2f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.05f,
                1.10f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(2).translateObject(0.75f,0.4f,0.0f);
        objects.get(5).getChildObject().get(2).scaleObject(5f,5f,5f);

        // balok kiri 2
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f,0.4f,0.2f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.05f,
                0.55f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(3).translateObject(1.31f,0.7f,0.0f);
        objects.get(5).getChildObject().get(3).scaleObject(5f,5f,5f);

        // backgorund kanan 2
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f,0.4f,0.2f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.05f,
                0.55f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(4).translateObject(0.69f,0.7f,0.0f);
        objects.get(5).getChildObject().get(4).scaleObject(5f,5f,5f);

        // backgorund atas ES
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.678f,0.847f,0.902f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.1f,
                0.30f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(5).translateObject(0.95f,1.1f,0.0f);
        objects.get(5).getChildObject().get(5).scaleObject(5f,5f,5f);

        // backgroun es mendatar
        // backgorund atas ES
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.678f,0.847f,0.902f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.345f,
                0.125f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(6).translateObject(0.97f,1.0f,0.0f);
        objects.get(5).getChildObject().get(6).scaleObject(5f,5f,5f);
//BATU
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.5f,0.5f,0.5f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.25f,
                0.55f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(7).translateObject(1.f,0.2f,0.0f);
        objects.get(5).getChildObject().get(7).scaleObject(5f,5f,5f);
//BAWAH BATU
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f,0.4f,0.2f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.125f,
                0.125f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(8).translateObject(0.77f,-0.135f,0.0f);
        objects.get(5).getChildObject().get(8).scaleObject(5f,5f,5f);

//         BAWAH BATU PANJANG

        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f,0.4f,0.2f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.455f,
                0.125f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(9).translateObject(1.08f,-0.135f,0.0f);
        objects.get(5).getChildObject().get(9).scaleObject(5f,5f,5f);

//        BAWAH BAWAH BATU KAYU
//         BAWAH BATU PANJANG

        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f,0.4f,0.2f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.455f,
                0.125f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(10).translateObject(0.934f,-0.265f,0.0f);
        objects.get(5).getChildObject().get(10).scaleObject(5f,5f,5f);

        //BAWAH BWAH BATU KANAN
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f,0.4f,0.2f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.135f,
                0.125f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(11).translateObject(1.24f,-0.265f,0.0f);
        objects.get(5).getChildObject().get(11).scaleObject(5f,5f,5f);

        // BATU PALING BAWAH
        //BAWAH BWAH BATU KANAN
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.5f,0.5f,0.5f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.335f,
                0.125f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(12).translateObject(1.145f,-0.4f,0.0f);
        objects.get(5).getChildObject().get(12).scaleObject(5f,5f,5f);

        //BATU PALING BAWAH KIRI
        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.5f,0.5f,0.5f,1.0f),
                Arrays.asList(0.0f,0.0f,0.0f),
                0.26f,
                0.125f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(13).translateObject(0.841f,-0.4f,0.0f);
        objects.get(5).getChildObject().get(13).scaleObject(5f,5f,5f);

        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.65f,
                0.05f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(14).translateObject(0.8f, 1.3f, 0.0f);
        objects.get(5).getChildObject().get(14).scaleObject(6.1f, 5f, 5f);
        objects.get(5).getChildObject().get(14).rotateObject((float) Math.toRadians(-43f),0f, 0f, 1f);


        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.05f,
                1.10f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(15).translateObject(1.6f, -0.2f, 0.0f);
        objects.get(5).getChildObject().get(15).scaleObject(5f, 3.4f, 5f);

        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.05f,
                1.10f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(16).translateObject(1.9f, -0.5f, 0.0f);
        objects.get(5).getChildObject().get(16).scaleObject(5f, 2.2f, 5f);

        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.65f,
                0.05f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(17).translateObject(1.637f, 0.25f, 0.0f);
        objects.get(5).getChildObject().get(17).scaleObject(6f, 5f, 5f);

        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.65f,
                0.05f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(18).translateObject(3f, 0.02f, 0.0f);
        objects.get(5).getChildObject().get(18).scaleObject(3.5f, 5f, 5f);

        objects.get(5).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.4f, 0.2f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.05f,
                1.10f,
                0.05f,
                36,
                500,
                3
        ));
        objects.get(5).getChildObject().get(19).translateObject(2.33f, -0.2f, 0.0f);
        objects.get(5).getChildObject().get(19).scaleObject(5f, 3.4f, 5f);



        objects.get(5).translateObject(4f,0f,0f);

        //ketapel
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1.0f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));

        objects.get(6).translateObject(-3f, -0f, 1.2f);
        objects.get(6).scaleObject(2f, 2f, 2f);
        objects.get(6).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);
        //batang ketapel kanan
        objects.get(6).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1.0f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));
        objects.get(6).getChildObject().get(0).scaleObject(2f, 2f, 1f);
        objects.get(6).getChildObject().get(0).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);
        objects.get(6).getChildObject().get(0).rotateObject((float)Math.toRadians(50f),0f,-0f,-1f);
        objects.get(6).getChildObject().get(0).translateObject(-6f, 1.4f, 0f);

        //batang ketapel kiri
        objects.get(6).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1.0f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));
        objects.get(6).getChildObject().get(1).scaleObject(2f, 2f, 1f);
        objects.get(6).getChildObject().get(1).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);
        objects.get(6).getChildObject().get(1).rotateObject((float)Math.toRadians(-50f),0f,-0f,-1f);
        objects.get(6).getChildObject().get(1).translateObject(-6f, 1.4f, 0f);

        //tali ketapel
        objects.get(6).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.2f, 0.1f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                2f,
                0.125f,
                0.125f,
                300,
                300,
                11
        ));
        objects.get(6).getChildObject().get(2).scaleObject(1.2f,8f,2.125f);
        objects.get(6).getChildObject().get(2).translateObject(-6f,2.3f,0.2f);

        objects.get(6).rotateObject((float) Math.toRadians(90f),0f, 1f, 0f);
        objects.get(6).translateObject(-7f,0f,-8f);
//batang pohon
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.3f, 0.2f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));

        objects.get(7).translateObject(-2f, -4f, 1.2f);
        objects.get(7).scaleObject(3f, 3f, 2f);
        objects.get(7).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);

        objects.get(7).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.f, 0.7f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(7).getChildObject().get(0).scaleObject(7f,7f,7f);
        objects.get(7).getChildObject().get(0).translateObject(-6.7f,2f,-12f);

        objects.get(7).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(7).getChildObject().get(1).scaleObject(7f,7f,7f);
        objects.get(7).getChildObject().get(1).translateObject(-5.3f,2f,-12f);

        objects.get(7).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(7).getChildObject().get(2).scaleObject(7f,7f,7f);
        objects.get(7).getChildObject().get(2).translateObject(-6f,3.3f,-12f);

        //batang pohon
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.3f, 0.2f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));

        objects.get(8).translateObject(-0.35f, -4f, 1.2f);
        objects.get(8).scaleObject(3f, 3f, 2f);
        objects.get(8).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);

        objects.get(8).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.f, 0.7f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(8).getChildObject().get(0).scaleObject(7f,7f,7f);
        objects.get(8).getChildObject().get(0).translateObject(-1.7f,2f,-12f);

        objects.get(8).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(8).getChildObject().get(1).scaleObject(7f,7f,7f);
        objects.get(8).getChildObject().get(1).translateObject(-0.3f,2f,-12f);

        objects.get(8).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(8).getChildObject().get(2).scaleObject(7f,7f,7f);
        objects.get(8).getChildObject().get(2).translateObject(-1f,3.3f,-12f);

        objects.get(8).translateObject(0f,0f,-3f);

        //batang pohon
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.3f, 0.2f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));

        objects.get(9).translateObject(-0.35f, -4f, 1.2f);
        objects.get(9).scaleObject(3f, 3f, 2f);
        objects.get(9).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);

        objects.get(9).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.f, 0.7f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(9).getChildObject().get(0).scaleObject(7f,7f,7f);
        objects.get(9).getChildObject().get(0).translateObject(-1.7f,2f,-12f);

        objects.get(9).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(9).getChildObject().get(1).scaleObject(7f,7f,7f);
        objects.get(9).getChildObject().get(1).translateObject(-0.3f,2f,-12f);

        objects.get(9).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(9).getChildObject().get(2).scaleObject(7f,7f,7f);
        objects.get(9).getChildObject().get(2).translateObject(-1f,3.3f,-12f);

        objects.get(9).translateObject(5f,0f,0f);

        //batang pohon
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.3f, 0.2f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));

        objects.get(10).translateObject(-0.35f, -4f, 1.2f);
        objects.get(10).scaleObject(3f, 3f, 2f);
        objects.get(10).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);

        objects.get(10).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.f, 0.7f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(10).getChildObject().get(0).scaleObject(7f,7f,7f);
        objects.get(10).getChildObject().get(0).translateObject(-1.7f,2f,-12f);

        objects.get(10).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(10).getChildObject().get(1).scaleObject(7f,7f,7f);
        objects.get(10).getChildObject().get(1).translateObject(-0.3f,2f,-12f);

        objects.get(10).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(10).getChildObject().get(2).scaleObject(7f,7f,7f);
        objects.get(10).getChildObject().get(2).translateObject(-1f,3.3f,-12f);

        objects.get(10).translateObject(4.5f,0f,-7f);

        //batang pohon
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.3f, 0.2f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));

        objects.get(11).translateObject(-2f, -4f, 1.2f);
        objects.get(11).scaleObject(3f, 3f, 2f);
        objects.get(11).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);

        objects.get(11).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.f, 0.7f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(11).getChildObject().get(0).scaleObject(7f,7f,7f);
        objects.get(11).getChildObject().get(0).translateObject(-6.7f,2f,-12f);

        objects.get(11).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(11).getChildObject().get(1).scaleObject(7f,7f,7f);
        objects.get(11).getChildObject().get(1).translateObject(-5.3f,2f,-12f);

        objects.get(11).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(11).getChildObject().get(2).scaleObject(7f,7f,7f);
        objects.get(11).getChildObject().get(2).translateObject(-6f,3.3f,-12f);

        objects.get(11).translateObject(-5f,0f,-4f);

        //batang pohon
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.6f, 0.3f, 0.2f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                2f,
                300,
                300,
                7
        ));
        objects.get(12).translateObject(-0.35f, -4f, 1.2f);
        objects.get(12).scaleObject(3f, 3f, 2f);
        objects.get(12).rotateObject((float) Math.toRadians(90f),1f, 0f, 0f);

        objects.get(12).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.f, 0.7f, .0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(12).getChildObject().get(0).scaleObject(7f,7f,7f);
        objects.get(12).getChildObject().get(0).translateObject(-1.7f,2f,-12f);

        objects.get(12).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(12).getChildObject().get(1).scaleObject(7f,7f,7f);
        objects.get(12).getChildObject().get(1).translateObject(-0.3f,2f,-12f);

        objects.get(12).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0f, 0.7f, 0f, 0.5f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                300,
                300,
                1
        ));
        objects.get(12).getChildObject().get(2).scaleObject(7f,7f,7f);
        objects.get(12).getChildObject().get(2).translateObject(-1f,3.3f,-12f);

        objects.get(12).translateObject(-4.5f,0f,-7f);

//        KEPALA
        objects.add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.8f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.133f,
                0.125f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(13).translateObject(0.0f, 0.0f, 0.0f);
        objects.get(13).scaleObject(5f, 5f, 5f);
// MATA KIRI
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.100f,
                0.100f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(0).translateObject(-0.3f, 0.0f, 0.90f);
        objects.get(13).getChildObject().get(0).scaleObject(0.9f, 0.9f, 0.63f);
        objects.get(13).getChildObject().get(0).setCenterPoint(Arrays.asList(0.0f, 0.0f, 0.0f));
//MATA KANAN
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.100f,
                0.100f,
                0.125f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(1).translateObject(0.4f, 0.0f, 0.80f);
        objects.get(13).getChildObject().get(1).scaleObject(0.9f, 0.9f, 0.63f);

////BOLA MATA KIRI
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.065f,
                0.065f,
                0.025f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(2).translateObject(-0.71f, 0.0f, 2.15f);
        objects.get(13).getChildObject().get(2).scaleObject(0.38f, 0.38f, 0.3f);


//BOLA MATA KANAN
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.065f,
                0.065f,
                0.025f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(3).translateObject(0.9f, 0.0f, 1.95f);
        objects.get(13).getChildObject().get(3).scaleObject(0.38f, 0.38f, 0.3f);

//ALIS KIRI
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.5f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.005f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(13).getChildObject().get(4).translateObject(-0.33f, 0.55f, -0.50f);
        objects.get(13).getChildObject().get(4).scaleObject(1.0f, 0.6f, -1f);
        objects.get(13).getChildObject().get(4).rotateObject((float) Math.toRadians(20f), 0f, 0f, 0.4f);
//
//ALIS KANAN
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.5f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.005f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(13).getChildObject().get(5).translateObject(0.30f, 0.5f, -0.5f);
        objects.get(13).getChildObject().get(5).scaleObject(1f, 0.6f, -1f);
        objects.get(13).getChildObject().get(5).rotateObject((float) Math.toRadians(20f), -0.2f, 0.3f, -0.4f);

//BELAKANG RAMBUT
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.125f,
                36,
                500,
                3
        ));
        objects.get(13).getChildObject().get(6).translateObject(0f, 0.0f, 0.688f);
        objects.get(13).getChildObject().get(6).scaleObject(2f, 0.7f, -1f);
        objects.get(13).getChildObject().get(6).rotateObject((float) Math.toRadians(20f), 1f, 0f, 0.f);

        // Hidung
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 1.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.125f,
                0.125f,
                0.185f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(7).translateObject(0.f, -0.0f, 1.0f);
        objects.get(13).getChildObject().get(7).scaleObject(1.2f, 0.9f, 0.63f);
        objects.get(13).getChildObject().get(7).rotateObject((float) Math.toRadians(20f), 0.0f, 0.0f, -0.4f);
        //bola hidung 1
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(-0.4f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.02f,
                0.04f,
                0.01f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(8).translateObject(0.05f, -0.0f, 1.12f);
        objects.get(13).getChildObject().get(8).scaleObject(1.2f, 0.9f, 0.63f);
        //bola hidung 2
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(-0.4f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.02f,
                0.04f,
                0.01f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(9).translateObject(-0.05f, -0.0f, 1.12f);
        objects.get(13).getChildObject().get(9).scaleObject(1.2f, 0.9f, 0.63f);

        // telinga kiri
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.9f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.175f,
                0.175f,
                0.175f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(10).translateObject(-0.8f, 1.3f, 1f);
        objects.get(13).getChildObject().get(10).scaleObject(0.38f, 0.38f, 0.3f);
        // telinga kanan
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.9f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.175f,
                0.175f,
                0.175f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(11).translateObject(0.2f, 1.5f, 1f);
        objects.get(13).getChildObject().get(11).scaleObject(0.38f, 0.38f, 0.3f);
        // telinga kiri hitam dalam
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.090f,
                0.090f,
                0.090f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(12).translateObject(-0.77f, 1.275f, 1.13f);
        objects.get(13).getChildObject().get(12).scaleObject(0.38f, 0.38f, 0.3f);
        //Telinga kanan hitam dalam
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.090f,
                0.090f,
                0.090f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(13).translateObject(0.2f, 1.46f, 1.12f);
        objects.get(13).getChildObject().get(13).scaleObject(0.38f, 0.38f, 0.3f);
        // mulut
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.9f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.105f,
                0.105f,
                0.105f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(14).translateObject(0.f, -0.06f, 0.94f);
        objects.get(13).getChildObject().get(14).scaleObject(1.2f, 0.9f, 0.63f);


        //mulut 2
        objects.get(13).getChildObject().add(new Sphere(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.5f, 0.0f, 1.0f),
                Arrays.asList(0.0f, 0.0f, 0.0f),
                0.075f,
                0.075f,
                0.075f,
                36,
                500,
                1
        ));
        objects.get(13).getChildObject().get(15).translateObject(0.f, -0.08f, 0.99f);
        objects.get(13).getChildObject().get(15).scaleObject(1.2f, 0.8f, 0.63f);

        objects.get(13).translateObject(14.5f,2.02f,0f);
    }


    int turn = 0;
    public void input(){
//
        if (window.isKeyPressed(GLFW_KEY_D)) {
            objects.get(2).translateObject(-0.05f,0.0f,0.0f);
            camera.moveRight(-0.05f);

        }
        if (window.isKeyPressed(GLFW_KEY_A)) {
            objects.get(2).translateObject(0.05f,0.0f,0.0f);
            camera.moveLeft(0.05f);

        }
        if (window.isKeyPressed(GLFW_KEY_W)) {
            objects.get(2).translateObject(0.0f, 0.0f, 0.05f);
            camera.moveForward(0.05f);

        }
        if (window.isKeyPressed(GLFW_KEY_S)) {
            objects.get(2).translateObject(0.0f,0.0f,-0.05f);
            camera.moveBackwards(0.05f);

        }
        if(window.isKeyPressed(GLFW_KEY_MINUS)){
            objects.get(2).translateObject(0.0f,-0.05f,0.0f);
            camera.moveDown(0.05f);
        }
        if(window.isKeyPressed(GLFW_KEY_EQUAL)){
            objects.get(2).translateObject(0.0f,0.05f,0.0f);
            camera.moveUp(0.05f);
        }
        if (window.isKeyPressed(GLFW_KEY_LEFT_ALT)) {
            camera.addRotation(0, (float) Math.toRadians(-0.5f));
            camera.moveLeft((float) Math.toRadians(-1.0f));
        }
        if (window.isKeyPressed(GLFW_KEY_RIGHT_ALT)) {
            camera.addRotation(0, (float) Math.toRadians(0.5f));
            camera.moveRight((float) Math.toRadians(1.0f));

        }
        if (window.isKeyPressed(GLFW_KEY_F1)) {
            camera.addRotation((float) Math.toRadians(0.5f), 0);
        }
        if (window.isKeyPressed(GLFW_KEY_F2)) {
            camera.addRotation((float) Math.toRadians(-1 * 0.5f),0);
        }

        if(window.isKeyPressed(GLFW_KEY_LEFT_SHIFT)){
            camera.moveForward(0.05f);
        }
        if(window.isKeyPressed(GLFW_KEY_LEFT_CONTROL)){
            camera.moveBackwards(0.05f);
        }
//        NICO
        if(window.isKeyPressed(GLFW_KEY_SPACE)  && looptime<=0 || looptime>0){
            Vector3f pala = objects.get(1).model.transformPosition(new Vector3f(0.0f,0.0f,0f));
            if(looptime<=0){
                looptime = 2f;
            }
            if(looptime >1.01) {
                objects.get(1).translateObject(0.0f,0.005f,0.0f);
                objects.get(1).getChildObject().get(12).translateObject(0.f,0.005f,0.0f);
                objects.get(1).getChildObject().get(13).translateObject(0.f,0.005f,0.0f);
                objects.get(1).getChildObject().get(14).translateObject(0.f,0.005f,0.0f);
                objects.get(1).getChildObject().get(2).translateObject(0.0005f,0.0005f,0.0f);
                objects.get(1).getChildObject().get(3).translateObject(-0.0005f,0.0005f,0.0f);
//                objects.get(1).translateObject(-pala.x,-pala.y,pala.z);
//                objects.get(1).rotateObject((float) Math.toRadians(3.6f),0f,1f,0f);
//                objects.get(1).getChildObject().get(12).rotateObject((float) Math.toRadians(3.6f),0f,1f,0f);
//                objects.get(1).getChildObject().get(13).rotateObject((float) Math.toRadians(3.6f),0f,1f,0f);
//                objects.get(1).getChildObject().get(14).rotateObject((float) Math.toRadians(3.6f),0f,1f,0f);
//                objects.get(1).translateObject(pala.x,pala.y,pala.z);

            }
            else if (looptime <=1.01){
                objects.get(1).getChildObject().get(12).translateObject(0.f,-0.005f,0.0f);
                objects.get(1).getChildObject().get(13).translateObject(0.f,-0.005f,0.0f);
                objects.get(1).getChildObject().get(14).translateObject(0.f,-0.005f,0.0f);
                objects.get(1).getChildObject().get(2).translateObject(-0.0005f,-0.0005f,0.0f);
                objects.get(1).getChildObject().get(3).translateObject(0.0005f,-0.0005f,0.0f);
                objects.get(1).translateObject(0.f,-0.005f,0.0f);
            }

            looptime-=0.01;
        }

        if(window.isKeyPressed(GLFW_KEY_Z)   && looptime8<=0 || looptime8>0){
            if(looptime8<=0){
                looptime8 = 2f;
            }
            if (looptime8 > 1.01){
                objects.get(1).translateObject(0.0f,0.005f,0.0f);
            }
            else if(looptime8 <= 1.01){
                objects.get(1).translateObject(0.f,-0.005f,0.0f);
            }
            looptime8-=0.01;
        }

        if(window.isKeyPressed(GLFW_KEY_C)   && looptime10<=0 || looptime10>0){
            Vector3f pala = objects.get(1).model.transformPosition(new Vector3f(0.0f,0.0f,0f));
            if(looptime10<=0){
                looptime10 = 2f;
            }
            if (looptime10 > 1.01){
                objects.get(1).getChildObject().get(12).translateObject(0.f,0.005f,0.0f);
                objects.get(1).getChildObject().get(13).translateObject(0.f,0.005f,0.0f);
                objects.get(1).getChildObject().get(14).translateObject(0.f,0.005f,0.0f);

            }
            else if(looptime10 <= 1.01){
                objects.get(1).getChildObject().get(12).translateObject(0.f,-0.005f,0.0f);
                objects.get(1).getChildObject().get(13).translateObject(0.f,-0.005f,0.0f);
                objects.get(1).getChildObject().get(14).translateObject(0.f,-0.005f,0.0f);
            }
            looptime10-=0.01;
        }
        if(window.isKeyPressed(GLFW_KEY_V)   && looptime11<=0 || looptime11>0){
            Vector3f pala = objects.get(1).model.transformPosition(new Vector3f(0.0f,0.0f,0f));
            if(looptime11<=0){
                looptime11 = 2f;
            }
            if (looptime11 > 1.01){
                objects.get(1).getChildObject().get(2).translateObject(0.0005f,0.0005f,0.0f);
                objects.get(1).getChildObject().get(3).translateObject(-0.0005f,0.0005f,0.0f);
            }
            else if(looptime11 <= 1.01){
                objects.get(1).getChildObject().get(2).translateObject(-0.0005f,-0.0005f,0.0f);
                objects.get(1).getChildObject().get(3).translateObject(0.0005f,-0.0005f,0.0f);
            }
            looptime11-=0.01;
        }

//        ALIS
//        PNY DARREN
        if (window.isKeyPressed(GLFW_KEY_Q)  && looptime2<=0 || looptime2>0 ) {
            Vector3f pala = objects.get(0).model.transformPosition(new Vector3f(0.0f,0.0f,0f));
            countDegree++;

            if(looptime2<=0){
                looptime2 = 2f;
            }
            if(looptime2 >1.01) {

                objects.get(0).translateObject(-pala.x,-pala.y,pala.z);
                objects.get(0).getChildObject().get(4).rotateObject((float) Math.toRadians(0.25f), 0f, 0.0f, 1f);
                objects.get(0).getChildObject().get(4).translateObject(0.0005f, 0.001f, 0f);
                objects.get(0).getChildObject().get(5).rotateObject((float) Math.toRadians(0.25f), 0f, 0.0f, -1f);
                objects.get(0).getChildObject().get(5).translateObject(-0.0005f, 0.0012f, 0f);
                objects.get(0).translateObject(pala.x,pala.y,pala.z);


            }else if (looptime2 <=1.01){
                objects.get(0).translateObject(-pala.x,-pala.y,pala.z);
                objects.get(0).getChildObject().get(4).rotateObject((float) Math.toRadians(0.25f), 0f, 0.0f, -1f);
                objects.get(0).getChildObject().get(4).translateObject(-0.0005f, -0.001f, 0f);
                objects.get(0).getChildObject().get(5).rotateObject((float) Math.toRadians(0.25f), 0f, 0.0f, 1f);
                objects.get(0).getChildObject().get(5).translateObject(0.0005f, -0.0012f, 0f);
                objects.get(0).translateObject(pala.x,pala.y,pala.z);
            }
            looptime2-=0.01;
        }
//RGB LIGHT
        if(window.isKeyPressed(GLFW_KEY_E)&& looptime3 <=0 || looptime3 >0){
            if(looptime3 <=0){
                looptime3 = 2.5f;
            }
            if(looptime3 <= 0.51) {
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(1f,1f,1f,0f));
            }
            else if (looptime3 <= 1.01){
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(1f,1f,0f,0f));
            }
            else if (looptime3 <= 1.51){
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(0f,0f,1f,0f));
            }
            else if (looptime3 <= 2.01){
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(0f,1f,0f,0f));
            }
            else if (looptime3 <= 2.51){
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(1f,0f,0f,0f));
            }
            looptime3 -=0.01;
        }
//        TOPI

        if(window.isKeyPressed(GLFW_KEY_F)&& looptime4<=0 || looptime4>0){
//            Vector3f pala = objects.get(0).model.transformPosition(new Vector3f(0.0f,0.0f,0f));
            countDegree++;

            if(looptime4 <=0){
                looptime4 = 2f;
            }
//            }
            if (looptime4 > 1){
//                objects.get(0).translateObject(-pala.x,-pala.y,pala.z);
                objects.get(0).getChildObject().get(11).translateObject(0.0f, 0.008f, 0f);
                objects.get(0).getChildObject().get(12).translateObject(-0.0f, 0.008f, 0f);
                objects.get(0).getChildObject().get(13).translateObject(-0.0f, 0.008f, 0f);
//                objects.get(0).translateObject(-pala.x,-pala.y,pala.z);
            }
            else if (looptime4 <= 1){

//                objects.get(0).translateObject(-pala.x,-pala.y,pala.z);
                objects.get(0).getChildObject().get(11).translateObject(0.0f, -0.008f, 0f);
                objects.get(0).getChildObject().get(12).translateObject(0.0f, -0.008f, 0f);
                objects.get(0).getChildObject().get(13).translateObject(0.0f, -0.008f, 0f);
//                objects.get(0).translateObject(-pala.x,-pala.y,pala.z);
            }

            looptime4 -=0.01;
        }
//        LOMPAT

        if(window.isKeyPressed(GLFW_KEY_G)   && looptime5<=0 || looptime5>0){
            countDegree++;
            if(looptime5<=0){
                looptime5 = 2f;
            }
            if (looptime5 > 1.01){
                objects.get(0).translateObject(0.0f,0.005f,0.0f);
            }
            else if(looptime5 <= 1.01){
                objects.get(0).translateObject(0.f,-0.005f,0.0f);
            }
            looptime5-=0.01;
        }

//        LOMPAT

        if(window.isKeyPressed(GLFW_KEY_G)   && looptime5<=0 || looptime5>0){
            countDegree++;
            if(looptime5<=0){
                looptime5 = 2f;
            }
            if (looptime5 > 1.01){
                objects.get(0).translateObject(0.0f,0.005f,0.0f);
            }
            else if(looptime5 <= 1.01){
                objects.get(0).translateObject(0.f,-0.005f,0.0f);
            }
            looptime5-=0.01;
        }

        if(window.isKeyPressed(GLFW_KEY_H)&& looptimed<=0 || looptimed>0){
            Vector3f pala = objects.get(0).model.transformPosition(new Vector3f(0.0f,0.0f,0f));

            if(looptimed<=0){
                looptimed = 3f;

            }
            if(looptimed >2.01) {
                objects.get(0).translateObject(0.0f,0.005f,0.0f);
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(1f,0f,0f,0f));
                objects.get(0).translateObject(-pala.x,-pala.y,pala.z);
                objects.get(0).getChildObject().get(4).rotateObject((float) Math.toRadians(0.25f), 0f, 0.0f, 1f);
                objects.get(0).getChildObject().get(4).translateObject(0.0005f, 0.001f, 0f);
                objects.get(0).getChildObject().get(5).rotateObject((float) Math.toRadians(0.25f), 0f, 0.0f, -1f);
                objects.get(0).getChildObject().get(5).translateObject(-0.0005f, 0.0012f, 0f);
                objects.get(0).translateObject(pala.x,pala.y,pala.z);
                objects.get(0).getChildObject().get(11).translateObject(0.0f, 0.008f, 0f);
                objects.get(0).getChildObject().get(12).translateObject(-0.0f, 0.008f, 0f);
                objects.get(0).getChildObject().get(13).translateObject(-0.0f, 0.008f, 0f);
            }
            else if (looptimed <=2.01 && looptimed > 1.01){
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(0f,1f,0f,0f));
                objects.get(0).translateObject(0.f,-0.005f,0.0f);

                objects.get(0).translateObject(-pala.x,-pala.y,pala.z);
                objects.get(0).getChildObject().get(4).rotateObject((float) Math.toRadians(0.25f), 0f, 0.0f, -1f);
                objects.get(0).getChildObject().get(4).translateObject(-0.0005f, -0.001f, 0f);
                objects.get(0).getChildObject().get(5).rotateObject((float) Math.toRadians(0.25f), 0f, 0.0f, 1f);
                objects.get(0).getChildObject().get(5).translateObject(0.0005f, -0.0012f, 0f);
                objects.get(0).translateObject(pala.x,pala.y,pala.z);
                objects.get(0).getChildObject().get(11).translateObject(0.0f, -0.008f, 0f);
                objects.get(0).getChildObject().get(12).translateObject(0.0f, -0.008f, 0f);
                objects.get(0).getChildObject().get(13).translateObject(0.0f, -0.008f, 0f);
            }
            else if (looptimed <= 1.01 && looptimed > 0.01){
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(0f,0f,1f,0f));

            }
            else if (looptimed <=0.1){
                objects.get(0).getChildObject().get(13).setColor(new Vector4f(1f,1f,1f,0f));
            }
            looptimed-=0.02;
        }

//        PUNYA JP
        if(window.isKeyPressed(GLFW_KEY_K)  || looptime7>0){
            if(looptime7<=0){
                looptime7 = 2f;
            }
            if(looptime7 >1.0) {
                objects.get(2).getChildObject().get(10).translateObject(0.0f,0.005f,0.0f);

                objects.get(2).getChildObject().get(11).translateObject(0.0f,-0.005f,0.0f);
            }else if (looptime7 <=1){
                objects.get(2).getChildObject().get(10).translateObject(0.0f,-0.005f,0.0f);

//                objects.get(2).getChildObject().get(10).rotateObject((float) Math.toRadians(2f), 1f, 0.0f, 0.0f);


                objects.get(2).getChildObject().get(11).translateObject(0.0f,0.005f,0.0f);

            }
            looptime7-=0.1;
        }


        if(window.isKeyPressed(GLFW_KEY_L) || looptime6>0){
            if(looptime6<=0){
                looptime6 = 160f;
            }
            if(looptime6 >140) {
                if(looptime6==160) {
                    float tempX =objects.get(2).getModel().get(3,0);
                    float tempy =objects.get(2).getModel().get(3,1);
                    float tempz =objects.get(2).getModel().get(3,2);
                    objects.get(2).translateObject(-tempX,0f,0f);
                    objects.get(2).rotateObject((float) Math.toRadians(180f), 0.0f, 1.0f, 0.0f);
                    objects.get(2).translateObject(tempX,0f,0f);
                }
                objects.get(2).translateObject(0.0f,0.0f,-1.0f);
            }
            else if (looptime6 >120){
                if(looptime6==140) {
                    float tempX =objects.get(2).getModel().get(3,0);
                    float tempy =objects.get(2).getModel().get(3,1);
                    float tempz =objects.get(2).getModel().get(3,2);
                    objects.get(2).translateObject(-tempX,0f,-tempz);
                    objects.get(2).rotateObject((float) Math.toRadians(90f), 0.0f, 1.0f, 0.0f);
                    objects.get(2).translateObject(tempX,0f,tempz);
                }
                objects.get(2).translateObject(-1.0f,0.0f,0.0f);

            }
            else if (looptime6 >100){
                if(looptime6==120) {
                    float tempX =objects.get(2).getModel().get(3,0);
                    float tempy =objects.get(2).getModel().get(3,1);
                    float tempz =objects.get(2).getModel().get(3,2);
                    objects.get(2).translateObject(-tempX,0f,-tempz);
                    objects.get(2).rotateObject((float) Math.toRadians(90f), 0.0f, 1.0f, 0.0f);
                    objects.get(2).translateObject(tempX,0f,tempz);
                }
                objects.get(2).translateObject(0.0f,0.0f,1.0f);
            }
            else if(looptime6 > 60){
                if(looptime6==100) {
                    float tempX =objects.get(2).getModel().get(3,0);
                    float tempy =objects.get(2).getModel().get(3,1);
                    float tempz =objects.get(2).getModel().get(3,2);
                    objects.get(2).translateObject(-tempX,0f,-tempz);
                    objects.get(2).rotateObject((float) Math.toRadians(90f), 0.0f, 1.0f, 0.0f);
                    objects.get(2).translateObject(tempX,0f,tempz);
                }
                objects.get(2).translateObject(1.0f,0.0f,0.0f);
            }
            else if(looptime6 > 40 ){
                if(looptime6==60) {
                    float tempX =objects.get(2).getModel().get(3,0);
                    float tempy =objects.get(2).getModel().get(3,1);
                    float tempz =objects.get(2).getModel().get(3,2);
                    objects.get(2).translateObject(-tempX,0f,-tempz);
                    objects.get(2).rotateObject((float) Math.toRadians(90f), 0.0f, 1.0f, 0.0f);
                    objects.get(2).translateObject(tempX,0f,tempz);
                }
                objects.get(2).translateObject(0.0f,0.0f,-1.0f);
            }
            else if(looptime6 > 20){
                if(looptime6==40) {
                    float tempX =objects.get(2).getModel().get(3,0);
                    float tempy =objects.get(2).getModel().get(3,1);
                    float tempz =objects.get(2).getModel().get(3,2);
                    objects.get(2).translateObject(-tempX,0f,-tempz);
                    objects.get(2).rotateObject((float) Math.toRadians(90f), 0.0f, 1.0f, 0.0f);
                    objects.get(2).translateObject(tempX,0f,tempz);
                }
                objects.get(2).translateObject(-1.0f,0.0f,0.0f);
            }
            else if(looptime6 <=20){
                if(looptime6==20) {
                    float tempX =objects.get(2).getModel().get(3,0);
                    float tempy =objects.get(2).getModel().get(3,1);
                    float tempz =objects.get(2).getModel().get(3,2);
                    objects.get(2).translateObject(-tempX,0f,-tempz);
                    objects.get(2).rotateObject((float) Math.toRadians(90f), 0.0f, 1.0f, 0.0f);
                    objects.get(2).translateObject(tempX,0f,tempz);
                }
                objects.get(2).translateObject(0.0f,0.0f,1.0f);
            }
            looptime6-=1;
        }
//        PUNYA NATAN
        if(window.isKeyPressed(GLFW_KEY_R)  || looptime12>0){
            if(looptime12<=0){
                looptime12 = 2f;
            }
//            if (window.isKeyPressed(GLFW_KEY_F)) {
//            countDegree++;
//            //rotasi terhadap matahari
//            objects.get(0).getChildObject().get(22).rotateObject((float) Math.toRadians(10f),1.0f,0.0f,0.0f);
//            objects.get(0).getChildObject().get(23).rotateObject((float) Math.toRadians(10f),1.0f,0.0f,0.0f);
//            objects.get(0).getChildObject().get(24).rotateObject((float) Math.toRadians(10f),1.0f,0.0f,0.0f);
//            objects.get(0).getChildObject().get(25).rotateObject((float) Math.toRadians(10f),1.0f,0.0f,0.0f);
//        }
            if(looptime12 >1.0001) {

                //shield

                objects.get(4).getChildObject().get(17).translateObject( 0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(17).rotateObject((float) Math.toRadians(0f),2.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(18).translateObject( 0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(18).rotateObject((float) Math.toRadians(0f),2.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(19).translateObject( 0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(19).rotateObject((float) Math.toRadians(0f),2.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(20).translateObject( 0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(20).rotateObject((float) Math.toRadians(0f),2.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(21).translateObject( 0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(21).rotateObject((float) Math.toRadians(0f),2.0f,0.0f,0.0f);
                // pedang
                objects.get(4).getChildObject().get(22).translateObject( 0.0f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(23).translateObject( 0.0f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(24).translateObject( 0.0f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(25).translateObject( 0.0f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(22).rotateObject((float) Math.toRadians(0.3f),1.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(23).rotateObject((float) Math.toRadians(0.3f),1.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(24).rotateObject((float) Math.toRadians(0.3f),1.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(25).rotateObject((float) Math.toRadians(0.3f),1.0f,0.0f,0.0f);
            }else if (looptime12 <=1){


                //shield
                objects.get(4).getChildObject().get(17).translateObject( -0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(17).rotateObject((float) Math.toRadians(0f),-2.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(18).translateObject( -0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(18).rotateObject((float) Math.toRadians(0f),-2.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(19).translateObject( -0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(19).rotateObject((float) Math.toRadians(0f),-2.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(20).translateObject( -0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(20).rotateObject((float) Math.toRadians(0f),-2.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(21).translateObject( -0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(21).rotateObject((float) Math.toRadians(0f),-2.0f,0.0f,0.0f);
                //pedang
                objects.get(4).getChildObject().get(22).translateObject( 0.0f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(23).translateObject( 0.0f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(24).translateObject( 0.0f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(25).translateObject( 0.0f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(22).rotateObject((float) Math.toRadians(0.3f),-1.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(23).rotateObject((float) Math.toRadians(0.3f),-1.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(24).rotateObject((float) Math.toRadians(0.3f),-1.0f,0.0f,0.0f);
                objects.get(4).getChildObject().get(25).rotateObject((float) Math.toRadians(0.3f),-1.0f,0.0f,0.0f);

            }
            looptime12-=0.01;
        }

        if (window.isKeyPressed(GLFW_KEY_1)) {
            countDegree++;
            //rotasi terhadap matahari
                turn =0;
        }
        if (window.isKeyPressed(GLFW_KEY_2)) {
            countDegree++;
            //rotasi terhadap matahari
                turn = 1;
        }

        if (window.isKeyPressed(GLFW_KEY_3)) {
            countDegree++;
            //rotasi terhadap matahari
                turn =2;
        }

        if (window.isKeyPressed(GLFW_KEY_4)) {
            countDegree++;
            //rotasi terhadap matahari
            turn =3;
        }

        if (window.isKeyPressed(GLFW_KEY_UP)) {
            countDegree++;
            //rotasi terhadap matahari
            if(turn == 0) {
                objects.get(0).translateObject(0.0f, 0.01f, 0f);
            }
//            objects.get(0).rotateObject((float) Math.toRadians(0.1f),-1.0f,0.0f,0.0f);
            else if(turn == 1){
                objects.get(1).translateObject(0.0f, 0.01f, 0f);
            }else if(turn == 2){
                objects.get(2).translateObject(0.0f, 0.01f, 0f);
            }else if(turn == 3){
                objects.get(4).translateObject(0.0f, 0.01f, 0f);
            }
        }
        if (window.isKeyPressed(GLFW_KEY_DOWN)) {

            if(turn == 0) {
                objects.get(0).translateObject(0.0f, -0.01f, 0f);
            }
//            objects.get(0).rotateObject((float) Math.toRadians(0.1f),-1.0f,0.0f,0.0f);
            else if(turn == 1){
                objects.get(1).translateObject(0.0f, -0.01f, 0f);
            }else if(turn == 2){
                objects.get(2).translateObject(0.0f, -0.01f, 0f);
            }else if(turn == 3){
                objects.get(4).translateObject(0.0f, -0.01f, 0f);
            }
        }
        if (window.isKeyPressed(GLFW_KEY_LEFT)) {
            countDegree++;
            //rotasi terhadap matahari

            if(turn == 0) {
                objects.get(0).translateObject(-0.01f, 0.0f, 0f);
            }
//            objects.get(0).rotateObject((float) Math.toRadians(0.1f),-1.0f,0.0f,0.0f);
            else if(turn == 1){
                objects.get(1).translateObject(-0.01f, 0.0f, 0f);
            }else if(turn == 2){
                objects.get(2).translateObject(-0.01f, 0.0f, 0f);
            }else if(turn == 3){
                objects.get(4).translateObject(-0.01f, 0.0f, 0f);
            }

        }
        if (window.isKeyPressed(GLFW_KEY_RIGHT)) {
            countDegree++;
            //rotasi terhadap matahari

            if(turn == 0) {
                objects.get(0).translateObject(0.01f, 0.0f, 0f);
            }
//            objects.get(0).rotateObject((float) Math.toRadians(0.1f),-1.0f,0.0f,0.0f);
            else if(turn == 1){
                objects.get(1).translateObject(0.01f, 0.0f, 0f);
            }else if(turn == 2){
                objects.get(2).translateObject(0.01f, 0.0f, 0f);
            }else if(turn == 3){
                objects.get(4).translateObject(0.01f, 0.0f, 0f);
            }
        }
        if(window.isKeyPressed(GLFW_KEY_COMMA)){
            if(turn == 0) {
                objects.get(0).translateObject(0.0f, 0.0f, 0.01f);
            }
//            objects.get(0).rotateObject((float) Math.toRadians(0.1f),-1.0f,0.0f,0.0f);
            else if(turn == 1){
                objects.get(1).translateObject(0.0f, 0.0f, 0.01f);
            }else if(turn == 2){
                objects.get(2).translateObject(0.0f, 0.0f, 0.01f);
            }else if(turn == 3){
                objects.get(4).translateObject(0.0f, 0.0f, 0.01f);
            }
        }
        if(window.isKeyPressed(GLFW_KEY_PERIOD)){
            if(turn == 0) {
                objects.get(0).translateObject(0.0f, 0.0f, -0.01f);
            }
//            objects.get(0).rotateObject((float) Math.toRadians(0.1f),-1.0f,0.0f,0.0f);
            else if(turn == 1){
                objects.get(1).translateObject(0.0f, 0.0f, -0.01f);
            }else if(turn == 2){
                objects.get(2).translateObject(0.0f, 0.0f, -0.01f);
            }else if(turn == 3){
                objects.get(4).translateObject(0.0f, 0.0f, -0.01f);
            }
        }
        if(window.isKeyPressed(GLFW_KEY_SEMICOLON)){
            if(turn == 0) {
                float xasal = objects.get(0).getModel().get(3,0);
                float zasal = objects.get(0).getModel().get(3,2);
                objects.get(0).translateObject(-xasal, 0.0f, -zasal);
                objects.get(0).rotateObject((float)Math.toRadians(1f),0.0f, 1f, -0.0f);
                objects.get(0).translateObject(xasal, 0.0f, zasal);

            }
//            objects.get(0).rotateObject((float) Math.toRadians(0.1f),-1.0f,0.0f,0.0f);
            else if(turn == 1){
                float xasal = objects.get(1).getModel().get(3,0);
                float zasal = objects.get(1).getModel().get(3,2);
                objects.get(1).translateObject(-xasal, 0.0f, -zasal);
                objects.get(1).rotateObject((float)Math.toRadians(1f),0.0f, 1.0f, -0.01f);
                objects.get(1).translateObject(xasal, 0.0f, zasal);

            }else if(turn == 2){
                float xasal = objects.get(2).getModel().get(3,0);
                float zasal = objects.get(2).getModel().get(3,2);
                    objects.get(2).translateObject(-xasal, 0.0f, -zasal);
                    System.out.println(xasal);
                objects.get(2).rotateObject((float)Math.toRadians(1f),0.0f, 1.0f, -0.0f);
                    objects.get(2).translateObject(xasal, 0.0f, zasal);
            }else if(turn == 3){
                float xasal = objects.get(4).getModel().get(3,0);
                float zasal = objects.get(4).getModel().get(3,2);
                objects.get(4).translateObject(-xasal, 0.0f, -zasal);
                objects.get(4).rotateObject((float)Math.toRadians(1f),0.0f, 1.0f, -0.01f);
                objects.get(4).translateObject(xasal, 0.0f, zasal);

            }
        }
            // kedua mata
        if(window.isKeyPressed(GLFW_KEY_T)  || looptime13>0){
            if(looptime13<=0){
                looptime13 = 2f;
            }
            if(looptime13 >1.01) {
                //mata kiri
                objects.get(4).getChildObject().get(2).translateObject( 0.001f,-0.0f,-0.0f);
                objects.get(4).getChildObject().get(2).rotateObject((float) Math.toRadians(0f),0.0f,0.0f,0.0f);


                //mata kanan
                objects.get(4).getChildObject().get(3).translateObject( 0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(3).rotateObject((float) Math.toRadians(0f),0.0f,0.0f,0.0f);


            }else if (looptime13 <=2.01){
                //mata kiri
                objects.get(4).getChildObject().get(2).translateObject( -0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(2).rotateObject((float) Math.toRadians(0f),0.0f,0.0f,0.0f);

                //mata kanan
                objects.get(4).getChildObject().get(3).translateObject( -0.001f,0.0f,-0.0f);
                objects.get(4).getChildObject().get(3).rotateObject((float) Math.toRadians(0f),0.0f,0.0f,0.0f);
            }
            looptime13-=0.03;
        }

        // loncat
        if(window.isKeyPressed(GLFW_KEY_Y)  || looptime14>0){
            if(looptime14<=0){
                looptime14 = 2f;
            }
            if(looptime14 >1.01) {

                objects.get(4).translateObject( 0.0f,0.005f,-0.0f);

            }else if (looptime14 <=1){

                objects.get(4).translateObject( 0.0f,-0.005f,-0.0f);

            }
            looptime14-=0.01;
        }


    }

    public void loop(){
        while (window.isOpen()) {
            window.update();
            glClearColor(0f, 0.4f, 1f, 0.0f);
            GL.createCapabilities();
            input();

            for(Object object: objects){
                object.draw(camera,projection);
            }

//            for(Object object: objectsPointsControl){
//                object.drawLine();
//            }

            // Restore state
            glDisableVertexAttribArray(0);

            // Poll for window events.
            // The key callback above will only be
            // invoked during this call.
            glfwPollEvents();
        }
    }
    public void run() {

        init();
        loop();

        // Terminate GLFW and
        // free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }
    public static void main(String[] args) {
        new Main().run();
    }
}