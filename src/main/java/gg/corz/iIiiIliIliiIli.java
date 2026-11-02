package gg.corz;

import java.util.ArrayDeque;
import net.minecraft.class_310;

public final class iIiiIliIliiIli {
   private static long iliIllIIIl;
   private static final ArrayDeque<Runnable> IliIllIIIl = new ArrayDeque<>();
   private static long lliIllIIIl = 50L;
   private static final class_310 iIiIllIIIl = class_310.method_1551();

   public static void lIiiIiIlilli() {
      if (iIiIllIIIl.field_1724 == null || iIiIllIIIl.field_1761 == null) {
         IliIllIIIl.clear();
         lIlillliIlilll.iliIiiliiiii();
         lIlIiIliIlIiIl.IIlilIliiIli();
      } else if (!IliIllIIIl.isEmpty()) {
         if (System.currentTimeMillis() - iliIllIIIl >= lliIllIIIl) {
            Runnable var0 = IliIllIIIl.poll();
            if (var0 != null) {
               try {
                  var0.run();
               } catch (Exception var2) {
               }

               iliIllIIIl = System.currentTimeMillis();
            }
         }
      }
   }

   private iIiiIliIliiIli() {
   }

   public static void IliIlllilIi(long ms) {
      lliIllIIIl = Math.max(0L, ms);
   }

   public static void liiiIIllIl(Runnable task) {
      if (task != null) {
         IliIllIIIl.add(task);
      }
   }

   public static void IilliliilIIi() {
      IliIllIIIl.clear();
   }

   public static int iIlIlllllill() {
      return IliIllIIIl.size();
   }
}
