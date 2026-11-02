package com.corz.client;

import gg.corz.IIIIIllllIIIIlll;
import gg.corz.IIIiiiIllIIiiiIl;
import gg.corz.IIIiillllIIiilll;
import gg.corz.IIIiliIilIIiliIi;
import gg.corz.IIiIIllIiIIl;
import gg.corz.IIililillIililil;
import gg.corz.IIliiIlllIliiIll;
import gg.corz.IIllIIlilIllIIli;
import gg.corz.Iiliillliliill;
import gg.corz.IilliIllilliIl;
import gg.corz.IlIIiillIIii;
import gg.corz.IlIIilIlllIIilIl;
import gg.corz.IlIiliIlllIiliIl;
import gg.corz.IliiIIIilliiIIIi;
import gg.corz.IliiIilliiIi;
import gg.corz.Iliiiiilliiiii;
import gg.corz.iIIiIlIiIlIiIlIi;
import gg.corz.iIiiIIilIliiIIil;
import gg.corz.iIlIilIlIllIilIl;
import gg.corz.iIliiIllii;
import gg.corz.iiIiliIIlili;
import gg.corz.iiIliiIIllii;
import gg.corz.iiiIIIlIIIlIIl;
import gg.corz.iiillilIIIilil;
import gg.corz.ilIIlilIiIIlil;
import gg.corz.ilIlIliIiIlIli;
import gg.corz.ilIllIiIll;
import gg.corz.iliiiiiIiiiiii;
import gg.corz.illIlIilIl;
import gg.corz.illIllilIilIllil;
import gg.corz.illlIlIlIillIlIl;
import gg.corz.illlllIillll;
import gg.corz.lIIlIIiliIIlIIil;
import gg.corz.lIiilIIliIiilIIl;
import gg.corz.lillliiliillliil;
import gg.corz.llIiiIIlilIiiIIl;
import gg.corz.llilIllililIll;
import gg.corz.llillililillil;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.ClientStopping;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Disconnect;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AfterEntities;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.EndExtraction;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterInit;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterRender;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents.AllowMouseClick;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import net.minecraft.class_476;
import net.minecraft.class_480;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;

public class CorzClient implements ClientModInitializer {
   public static llillililillil fontManager;
   private static boolean guiKeyWasPressed = false;
   private static final Map<ilIllIiIll, Boolean> keyDown = new HashMap<>();

   private static boolean ownsKeyAsSetting(ilIllIiIll m, int key) {
      for (IilliIllilliIl var3 : m.IiIlliIliiIl()) {
         if (var3 instanceof illlIlIlIillIlIl var4 && var4.IIillIiliIil() && lIIlIIiliIIlIIil.IliIlllilIi(key, var4.Ililllililil())) {
            return true;
         }
      }

      return false;
   }

   private static boolean bindDown(class_1041 code, int window) {
      if (window < 0) {
         return false;
      } else {
         return IlIiliIlllIiliIl.IliIlllilIi(window)
            ? GLFW.glfwGetMouseButton(code.method_4490(), IlIiliIlllIiliIl.liiiIIllIl(window)) == 1
            : class_3675.method_15987(code, window);
      }
   }

   public static IIliiIlllIliiIll fontRenderer() {
      return fontManager.lIiiIiIlilli();
   }

   private static void pollContainerBind(class_1041 window, ilIllIiIll m) {
      long var5 = -195423944033929327L;
      long var7 = 3501788637691961361L;
      var5 ^= ((long)m.IIIilIIiiIIi() << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) >= 0 && !ownsKeyAsSetting(m, (int)(var5 >>> 32))) {
         var5 ^= ((long)bindDown(window, (int)(var5 >>> 32)) ^ var5) & -1L >>> 32;
         var7 ^= ((long)keyDown.getOrDefault(m, false).booleanValue() << 32 ^ var7) & -1L << 32;
         keyDown.put(m, Boolean.valueOf((boolean)((int)var5)));
         if (m.IliIlllilIi() || !ilIIlilIiIIlil.liiiIIllIl(m) || ilIIlilIiIIlil.IIillIiliIil(m)) {
            if (m.IiIiliIiiiIi() == ilIlIliIiIlIli.llilIIIIIl) {
               if ((int)var5 != 0 && (int)(var7 >>> 32) == 0) {
                  m.IIillIiliIil(true);
               } else if ((int)var5 == 0 && (int)(var7 >>> 32) != 0) {
                  m.IIillIiliIil(false);
               }
            } else if ((int)var5 != 0 && (int)(var7 >>> 32) == 0) {
               m.Ililllililil();
            }
         }
      } else {
         keyDown.put(m, false);
      }
   }

   public void onInitializeClient() {
      iiIliiIIllii.iIlIlllllill();
      IIIIIllllIIIIlll.liiiIIllIl();
      lIiilIIliIiilIIl.iIlIlllllill();
      fontManager = new llillililillil();
      llilIllililIll.IliIlllilIi();
      iiIiliIIlili.IliIlllilIi();
      ClientLifecycleEvents.CLIENT_STOPPING.register((ClientStopping)client -> iiIiliIIlili.lIiiIiIlilli());
      ClientPlayConnectionEvents.DISCONNECT.register((Disconnect)(client, handler) -> illIlIilIl.liiiIIllIl());
      ClientPlayConnectionEvents.DISCONNECT.register((Disconnect)(handler, client) -> {
         if (llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class) instanceof iIlIilIlIllIilIl var2) {
            var2.lIIIiIlliIIIiIll();
         }
      });
      ClientPlayConnectionEvents.DISCONNECT.register((Disconnect)(handler, client) -> {
         IIIiillllIIiilll.lIiiIiIlilli();
         illIllilIilIllil.IilliliilIIi();
         IIllIIlilIllIIli.IllIllllIl();
         iIIiIlIiIlIiIlIi.Iilllilliill();
      });
      Iiliillliliill.IliIlllilIi();
      WorldRenderEvents.END_EXTRACTION.register((EndExtraction)context -> iliiiiiIiiiiii.IliIlllilIi(context.frustum()));
      WorldRenderEvents.AFTER_ENTITIES.register((AfterEntities)context -> {
         if (!IIiIIllIiIIl.IliIlllilIi()) {
            class_310 var1 = class_310.method_1551();
            if (var1.field_1687 != null && var1.field_1724 != null) {
               float var2 = var1.method_61966().method_60637(false);
               illlllIillll var3 = new illlllIillll(context.matrices(), new Matrix4f(), var2);
               var3.IIIIIlIilIIIIlIi = context.commandQueue();
               llilIllililIll.IIIllIIliIIl(var3);
               iIiiIIilIliiIIil.IiIiliIiiiIi();
            }
         }
      });
      ScreenEvents.AFTER_INIT
         .register(
            (AfterInit)(screen, client, scaledWidth, scaledHeight) -> {
               if (client instanceof class_480 var4) {
                  iIliiIllii var5 = (iIliiIllii)llilIllililIll.iliIiiliiiii(iIliiIllii.class);
                  if (var5 != null) {
                     llIiiIIlilIiiIIl var6 = new llIiiIIlilIiiIIl(var4, var5);
                     ScreenEvents.afterRender(client).register((AfterRender)(mx, my, ctx, s, panel) -> var6.IIillIiliIil(my, ctx, s));
                     ScreenMouseEvents.allowMouseClick(client)
                        .register((AllowMouseClick)(s, panel) -> !var6.IiIiliIiiiIi(panel.comp_4798(), panel.comp_4799(), panel.method_74245()));
                  }
               }
            }
         );
      ClientTickEvents.END_CLIENT_TICK
         .register(
            (EndTick)client -> {
               long var8 = -2351136773380957812L;
               long var10 = 1733234760780060303L;
               long var12 = 4207528220103663858L;
               if (!IIiIIllIiIIl.IliIlllilIi()) {
                  llilIllililIll.iIlIlllllill();
                  iiiIIIlIIIlIIl.iIlIlllllill();
                  IliiIIIilliiIIIi var1 = (IliiIIIilliiIIIi)llilIllililIll.iliIiiliiiii(IliiIIIilliiIIIi.class);
                  if (var1 != null && client.field_1755 == null && client.field_1724 != null) {
                     var8 ^= ((long)var1.IIIilIIiiIIi() << 32 ^ var8) & -1L << 32;
                     if ((int)(var8 >>> 32) >= 0) {
                        class_1041 var3 = client.method_22683();
                        var8 ^= ((long)bindDown(var3, (int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
                        if ((int)var8 != 0 && !guiKeyWasPressed) {
                           var10 ^= ((long)(!class_3675.method_15987(var3, 341) && !class_3675.method_15987(var3, 345) ? 0 : 1) << 32 ^ var10) & -1L << 32;
                           if (IIIIIllllIIIIlll.IiIlliIliiIl()) {
                              client.method_1507(new lillliiliillliil());
                           } else {
                              client.method_1507(new IIIiiiIllIIiiiIl(null, true));
                           }
                        }

                        guiKeyWasPressed = (boolean)((int)var8);
                     }
                  }

                  if (client.field_1755 == null) {
                     class_1041 var2 = client.method_22683();

                     for (ilIllIiIll var4 : IIIiliIilIIiliIi.IliIlllilIi().IilliliilIIi()) {
                        if (!(var4 instanceof IliiIIIilliiIIIi)) {
                           var10 ^= ((long)var4.IIIilIIiiIIi() << 32 ^ var10) & -1L << 32;
                           if (((int)(var10 >>> 32) < 0 || !ownsKeyAsSetting(var4, (int)(var10 >>> 32))) && (int)(var10 >>> 32) >= 0) {
                              var10 ^= ((long)bindDown(var2, (int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
                              var12 ^= ((long)keyDown.getOrDefault(var4, false).booleanValue() << 32 ^ var12) & -1L << 32;
                              keyDown.put(var4, Boolean.valueOf((boolean)((int)var10)));
                              if ((int)var10 != 0
                                 && (int)(var12 >>> 32) == 0
                                 && !var4.IliIlllilIi()
                                 && ilIIlilIiIIlil.liiiIIllIl(var4)
                                 && !ilIIlilIiIIlil.IIillIiliIil(var4)
                                 && IIIIIllllIIIIlll.IiIlliIliiIl()) {
                                 client.method_1507(new lillliiliillliil(var4));
                              } else if (var4.IiIiliIiiiIi() == ilIlIliIiIlIli.llilIIIIIl) {
                                 if ((int)var10 != 0 && (int)(var12 >>> 32) == 0) {
                                    var4.IIillIiliIil(true);
                                 } else if ((int)var10 == 0 && (int)(var12 >>> 32) != 0) {
                                    var4.IIillIiliIil(false);
                                 }
                              } else if ((int)var10 != 0 && (int)(var12 >>> 32) == 0) {
                                 var4.Ililllililil();
                              }
                           }
                        }
                     }
                  } else {
                     var8 ^= ((long)(client.field_1755 instanceof class_476) << 32 ^ var8) & -1L << 32;

                     for (ilIllIiIll var16 : IIIiliIilIIiliIi.IliIlllilIi().IilliliilIIi()) {
                        if ((int)(var8 >>> 32) != 0 && var16.IIlilIliiIli()) {
                           pollContainerBind(client.method_22683(), var16);
                        } else {
                           if (var16.IiIiliIiiiIi() == ilIlIliIiIlIli.llilIIIIIl && var16.IliIlllilIi()) {
                              var16.IIillIiliIil(false);
                           }

                           keyDown.put(var16, false);
                        }
                     }

                     guiKeyWasPressed = false;
                  }
               }
            }
         );
      HudRenderCallback.EVENT.register((HudRenderCallback)(tick, ctx) -> {
         long var7 = -2397383752126859562L;
         if (!IIiIIllIiIIl.IliIlllilIi()) {
            IlIIiillIIii.IliIlllilIi();
            if (IlIIilIlllIIilIl.liiiIIllIl()) {
               IlIIilIlllIIilIl.IilliliilIIi();
            }

            class_310 var2 = class_310.method_1551();
            fontManager.iIlIlllllill(null);
            IliiIilliiIi.iiIIlIIlIl();

            try {
               var7 ^= ((long)IIililillIililil.liIlliiIll() << 32 ^ var7) & -1L << 32;
               if ((int)(var7 >>> 32) == 0) {
                  Iliiiiilliiiii.IliIlllilIi().IilliliilIIi(tick);
               }

               if (llilIllililIll.iliIiiliiiii(IIililillIililil.class) instanceof IIililillIililil var4) {
                  var4.liilliiill(tick);
               }

               if ((int)(var7 >>> 32) != 0) {
                  Iliiiiilliiiii.IliIlllilIi().IilliliilIIi(tick);
               }

               iiillilIIIilil.IIlllIlliIll(tick);
            } finally {
               IliiIilliiIi.lIlIliIlIl();
            }
         }
      });
   }
}
