package gg.corz;

import com.corz.client.qvm.Runtime;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class llilIllililIll {
   private static final Map<Class<? extends ilIllIiIll>, ilIllIiIll> IliiIIlillliiIIlil = new IdentityHashMap<>();
   private static final List<ilIllIiIll> iiliIIlilIIiiIIlil = new ArrayList<>();
   private static final Map<lllIllillIll, List<ilIllIiIll>> lIiiIIliliIiiIIlil = new EnumMap<>(lllIllillIll.class);

   private static void liiiIIllIl(ilIllIiIll module) {
      iiliIIlilIIiiIIlil.add(module);
      IliiIIlillliiIIlil.putIfAbsent((Class<? extends ilIllIiIll>)module.getClass(), module);
      lIiiIIliliIiiIIlil.get(module.iliIiiliiiii()).add(module);
   }

   public static void Iilllilliill(IiIiIlIiliIiIlIi packetSendEvent) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.llIIlilIIl(packetSendEvent);
            }
         }
      }
   }

   public static void IIIllIIliIIl(illlllIillll render3DEvent) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         iIiiIIilIliiIIil.Iilllilliill(render3DEvent.IliiiIIilliiiIIi);

         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.IIiilIiiiIii(render3DEvent);
            }
         }

         if (iliIiiliiiii(iIlIilIlIllIilIl.class) instanceof iIlIilIlIllIilIl var3) {
            var3.lIlilIlliIlilIll(render3DEvent);
            var3.lIIiliIliIIiliIl(render3DEvent);
         }

         if (iliIiiliiiii(iiliililIIiiilil.class) instanceof iiliililIIiiilil var4 && !var4.IliIlllilIi()) {
            var4.IIIillIIil(render3DEvent);
         }

         if (iliIiiliiiii(llIiIlilIiIl.class) instanceof llIiIlilIiIl var5) {
            var5.ilililIiilil(render3DEvent);
         }

         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   static {
      Runtime.loadVm(llilIllililIll.class, MethodHandles.lookup());
   }

   public static ilIllIiIll iliIiiliiiii(Class<? extends ilIllIiIll> clazz) {
      return IliiIIlillliiIIlil.get(clazz);
   }

   public static void IlIlllIlilIl(lIiIlliiIiIlli render2DEvent) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.Iliilliiilii(render2DEvent);
            }
         }

         if (iliIiiliiiii(iIlIilIlIllIilIl.class) instanceof iIlIilIlIllIilIl var3) {
            var3.IlIiliIlllIiliIl(render2DEvent);
            var3.IiIliIllliIliIll(render2DEvent);
         }

         if (iliIiiliiiii(llIiIlilIiIl.class) instanceof llIiIlilIiIl var4) {
            var4.liililiiilil(render2DEvent);
         }
      }
   }

   public static void IlIillIiilIi(iilIIlilIIiIIlil event) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.illIlIilIl(event);
            }
         }
      }
   }

   public static void IliIlllilIi() {
      Runtime.run(7242439472085811265L, -243278682, new Object[21]);
   }

   public static void Illlllllilll() {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         lIlIiIliIlIiIl.IliIlllilIi();
         IIllIIlilIllIIli.Iilililiiili();
         lIIIililiIIIilil.liiiIIllIl();
         illIllilIilIllil.iIlIlllllill();
         IIIiillllIIiilll.IilliliilIIi();
         iIlIilIlIllIilIl var0 = iliIiiliiiii(iIlIilIlIllIilIl.class) instanceof iIlIilIlIllIilIl var1 ? var1 : null;
         if (var0 != null) {
            var0.lililIlliililIll();
         }

         for (ilIllIiIll var5 : iiliIIlilIIiiIIlil) {
            if (var5.IliIlllilIi()) {
               var5.iIIIlIlIIl();
            }
         }

         if (var0 != null) {
            var0.iIilliIlIlilliIl();
            var0.IllIliilllIlii();
         }

         if (iliIiiliiiii(llIiIlilIiIl.class) instanceof llIiIlilIiIl var4) {
            var4.IllIillllIil();
         }

         iIiiIliIliiIli.lIiiIiIlilli();
         ilIiiIiIii.iliIiiliiiii();
      }
   }

   public static void IiIlliIliiIl(iillIIIlIIilIIIl postItemUseEvent) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.Iiiiliiiiiii(postItemUseEvent);
            }
         }
      }
   }

   public static void IIIilIIiiIIi(IiiiIIIlliiiIIIl event) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.IllIllllIl(event);
            }
         }

         if (iliIiiliiiii(iIlIilIlIllIilIl.class) instanceof iIlIilIlIllIilIl var3) {
            var3.IiIlliIlliIlliIl(event);
         }
      }
   }

   public static List<ilIllIiIll> lIiiIiIlilli(lllIllillIll category) {
      return lIiiIIliliIiiIIlil.getOrDefault(category, new ArrayList<>());
   }

   public static void IIillIiliIil(IliIliIllliIliIl packetReceiveEvent) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.IiIIlliIIl(packetReceiveEvent);
            }
         }
      }
   }

   public static void IIlllIlliIll(iiiIliIIIlli preItemUseEvent) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.IIIIllIIIl(preItemUseEvent);
            }
         }

         if (iliIiiliiiii(llIiIlilIiIl.class) instanceof llIiIlilIiIl var3) {
            var3.illIilIilIil(preItemUseEvent);
         }
      }
   }

   public static void Ililllililil(iIIlIlIlIlIlIlIl cameraEvent) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.iiIIlIIlIl(cameraEvent);
            }
         }
      }
   }

   public static void iIlIlllllill() {
      Runtime.run(9090156921011325306L, 900522744, new Object[17]);
   }

   public static List<ilIllIiIll> IilliliilIIi() {
      return iiliIIlilIIiiIIlil;
   }

   public static void IiIiliIiiiIi(IiiIlllliiIlll event) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.lilIliilIl(event);
            }
         }

         if (iliIiiliiiii(iIlIilIlIllIilIl.class) instanceof iIlIilIlIllIilIl var3) {
            var3.llIlliIlilIlliIl(event);
         }

         if (iliIiiliiiii(llIiIlilIiIl.class) instanceof llIiIlilIiIl var4) {
            var4.llIlllilIlll(event);
         }
      }
   }

   public static void Iiilliiliiil(IIilllilIillli event) {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         for (ilIllIiIll var2 : iiliIIlilIIiiIIlil) {
            if (var2.IliIlllilIi()) {
               var2.lIlIliIlIl(event);
            }
         }
      }
   }
}
