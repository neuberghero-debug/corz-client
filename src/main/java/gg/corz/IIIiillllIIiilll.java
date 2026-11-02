package gg.corz;

import com.corz.client.mixins.AccessorClientConnection;
import io.netty.channel.Channel;
import java.util.function.Predicate;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_634;
import net.minecraft.class_8038;

public final class IIIiillllIIiilll {
   public static final long IiiliIlill = Long.MAX_VALUE;
   public static final long liiliIlill = 60000L;
   public static final long iiiliIlill = 1000L;
   private static final long IIIiiIlill = System.currentTimeMillis();
   private static volatile long iIIiiIlill = -1L;
   private static final long lIIiiIlill = System.nanoTime();

   static boolean IlIlllIlilIl(class_2535 c) {
      return c != null && c.method_10744() instanceof class_634;
   }

   public static boolean iliIiiliiiii(class_2596<?> packet, Predicate<class_2596<?>> test) {
      if (packet instanceof class_8038 var2) {
         for (class_2596 var4 : var2.method_48324()) {
            if (test.test(var4)) {
               return true;
            }
         }

         return false;
      } else {
         return packet != null && test.test(packet);
      }
   }

   static Channel IIlllIlliIll(class_2535 c) {
      return c == null ? null : ((AccessorClientConnection)c).corzChannel();
   }

   public static void IilliliilIIi() {
      iiIliillIIlliill.Ililllililil();
      iillIlllIIilIlll.Illlllllilll();
   }

   public static void lIiiIiIlilli() {
      iiIliillIIlliill.IIlllIlliIll();
      iillIlllIIilIlll.IiIlliIliiIl();
   }

   static long liiiIIllIl(long baseMs, long nowNs, long originNs) {
      return baseMs + (originNs - nowNs) / 1000000L;
   }

   public static long iIlIlllllill() {
      return iIIiiIlill;
   }

   static boolean IiIlliIliiIl(class_2535 c) {
      return IIIllIIliIIl(c) && c.method_10758() && IlIlllIlilIl(c);
   }

   public static long IliIlllilIi() {
      return liiiIIllIl(IIIiiIlill, lIIiiIlill, System.nanoTime());
   }

   static boolean IIIllIIliIIl(class_2535 c) {
      return c != null && c.method_36121() == class_2598.field_11942;
   }

   private IIIiillllIIiilll() {
   }
}
