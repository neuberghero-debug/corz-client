package gg.corz;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2793;
import net.minecraft.class_2827;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_8591;

public final class iiIliillIIlliill {
   private static final AtomicInteger liiiIiiill = new AtomicInteger();
   private static class_2535 iiiiIiiill;
   private static final iIIIIlIlIIIl<IIliIlIllIliIlIl> iliiIiiill = new iIIIIlIlIIIl<>(60000L);
   private static final Object lliiIiiill = new Object();
   private static final ThreadLocal<Boolean> IiiiIiiill = ThreadLocal.withInitial(() -> Boolean.FALSE);

   public static int IilliliilIIi() {
      synchronized (lliiIiiill) {
         return iliiIiiill.liiiIIllIl();
      }
   }

   private static void IlIillIiilIi() {
      if (iliiIiiill.IliIlllilIi()) {
         iiiiIiiill = null;
      }
   }

   public static void IIlllIlliIll() {
      synchronized (lliiIiiill) {
         IIIilIIiiIIi();
      }
   }

   private static void IIIilIIiiIIi() {
      iliiIiiill.IIlllIlliIll();
      iiiiIiiill = null;
   }

   private static void IiIiliIiiiIi(long now) {
      if (!iliiIiiill.IliIlllilIi()) {
         class_2535 var2 = iiiiIiiill;
         List var3 = iliiIiiill.IlIlllIlilIl(now);
         IlIillIiilIi();

         for (IIliIlIllIliIlIl var5 : var3) {
            Illillliilli(var2, var5);
         }
      }
   }

   public static void IlIlllIlilIl() {
      synchronized (lliiIiiill) {
         IiIiliIiiiIi(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   private iiIliillIIlliill() {
   }

   public static void Iilllilliill(IiIiIlIiliIiIlIi event) {
      if (event.IilliliilIIi() && event.lIiiIiIlilli()) {
         class_2596 var1 = event.lIiilIIIIi;
         synchronized (lliiIiiill) {
            lIiIlliIiIll var3 = iliiIiiill.lIiiIiIlilli(p -> p.IliIlllilIi() == var1);
            if (var3 != null) {
               iliiIiiill.iliIiiliiiii(var3);
            }

            IlIillIiilIi();
         }
      }
   }

   private static void Illillliilli(class_2535 c, IIliIlIllIliIlIl h) {
      Channel var2 = IIIiillllIIiilll.IIlllIlliIll(c);
      if (var2 != null && c.method_10758()) {
         liiiIiiill.incrementAndGet();

         try {
            var2.eventLoop().execute(() -> {
               try {
                  IiiiIiiill.set(Boolean.TRUE);

                  try {
                     c.method_52906(h.IliIlllilIi(), h.liiiIIllIl(), h.iIlIlllllill());
                  } finally {
                     IiiiIiiill.set(Boolean.FALSE);
                  }
               } finally {
                  liiiIiiill.decrementAndGet();
               }
            });
         } catch (RejectedExecutionException var4) {
            liiiIiiill.decrementAndGet();
         }
      }
   }

   public static long lIiiIiIlilli() {
      synchronized (lliiIiiill) {
         return iliiIiiill.Ililllililil(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   public static boolean Illlllllilll(class_2596<?> packet) {
      class_634 var1 = class_310.method_1551().method_1562();
      if (packet != null && var1 != null) {
         class_2535 var2 = var1.method_48296();
         if (!IIIiillllIIiilll.IiIlliIliiIl(var2)) {
            return false;
         } else {
            var2.method_52906(packet, null, true);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void iliIiiliiiii(Object owner) {
      synchronized (lliiIiiill) {
         iliiIiiill.Illlllllilll(owner);
         IiIiliIiiiIi(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   private static void Iiilliiliiil(class_2535 c) {
      if (iiiiIiiill != c) {
         iliiIiiill.IIlllIlliIll();
         iiiiIiiill = c;
      }
   }

   public static void IiIlliIliiIl() {
      synchronized (lliiIiiill) {
         IIlilIliiIli();
      }
   }

   public static boolean IIillIiliIil(class_2535 flush, class_2596<?> listener, ChannelFutureListener p, boolean c) {
      long var11 = -58581883461555826L;
      if (!IiiiIiiill.get() && IIIiillllIIiilll.IIIllIIliIIl(flush)) {
         Channel var4 = IIIiillllIIiilll.IIlllIlliIll(flush);
         var11 ^= ((long)(var4 != null && var4.eventLoop().inEventLoop() ? 1 : 0) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)(listener instanceof class_2827) ^ var11) & -1L >>> 32;
         synchronized (lliiIiiill) {
            if (iiiiIiiill != flush && !iliiIiiill.IliIlllilIi()) {
               IIIilIIiiIIi();
            }

            if (IIiIIllIiIIl.IliIlllilIi() || listener instanceof class_2793 || listener instanceof class_8591) {
               IIlilIliiIli();
            } else if ((int)var11 == 0 && !iliiIiiill.IliIlllilIi()) {
               if (!IIIiillllIIiilll.IlIlllIlilIl(flush)) {
                  IIIilIIiiIIi();
               } else {
                  long var8 = IIIiillllIIiilll.IliIlllilIi();
                  IiIiliIiiiIi(var8);
                  if (!iliiIiiill.IliIlllilIi()) {
                     iliiIiiill.iIlIlllllill(new IIliIlIllIliIlIl(listener, p, c), var8);
                     return true;
                  }
               }
            }

            if ((int)(var11 >>> 32) != 0 && (int)var11 == 0 && liiiIiiill.get() > 0) {
               Illillliilli(flush, new IIliIlIllIliIlIl(listener, p, c));
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public static void IIIllIIliIIl(Object latestUntilMs, long owner) {
      synchronized (lliiIiiill) {
         iliiIiiill.Iilllilliill(latestUntilMs, owner);
         IiIiliIiiiIi(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   public static boolean IliIlllilIi(Object untilMs, IiIiIlIiliIiIlIi event, long owner) {
      if (untilMs == null || event == null || event.lIiilIIIIi == null || event.lIiiIiIlilli()) {
         return false;
      } else if (IIiIIllIiIIl.IliIlllilIi()) {
         return false;
      } else {
         class_2535 var4 = event.iIlIlllllill();
         if (!IIIiillllIIiilll.IiIlliIliiIl(var4)) {
            return false;
         } else {
            class_2596 var5 = event.lIiilIIIIi;
            if (!(var5 instanceof class_2827) && !(var5 instanceof class_2793) && !(var5 instanceof class_8591)) {
               synchronized (lliiIiiill) {
                  if (untilMs instanceof ilIllIiIll var7 && !var7.IliIlllilIi()) {
                     return false;
                  }

                  if (event.IilliliilIIi()) {
                     lIiIlliIiIll var10 = iliiIiiill.lIiiIiIlilli(p -> p.IliIlllilIi() == var5);
                     if (var10 == null) {
                        return false;
                     } else {
                        var10.IilliliilIIi(untilMs, owner);
                        return true;
                     }
                  } else {
                     Iiilliiliiil(var4);
                     iliiIiiill.iIlIlllllill(new IIliIlIllIliIlIl(var5, null, true), IIIiillllIIiilll.IliIlllilIi()).IilliliilIIi(untilMs, owner);
                     event.iliIiiliiiii();
                     return true;
                  }
               }
            } else {
               return false;
            }
         }
      }
   }

   public static boolean liiiIIllIl() {
      synchronized (lliiIiiill) {
         return !iliiIiiill.IliIlllilIi();
      }
   }

   static void Ililllililil() {
      synchronized (lliiIiiill) {
         if (!iliiIiiill.IliIlllilIi()) {
            if (!IIIiillllIIiilll.IiIlliIliiIl(iiiiIiiill)) {
               IIIilIIiiIIi();
            } else {
               IiIiliIiiiIi(IIIiillllIIiilll.IliIlllilIi());
            }
         }
      }
   }

   private static void IIlilIliiIli() {
      if (!iliiIiiill.IliIlllilIi()) {
         class_2535 var0 = iiiiIiiill;
         List var1 = iliiIiiill.IiIlliIliiIl();
         IlIillIiilIi();

         for (IIliIlIllIliIlIl var3 : var1) {
            Illillliilli(var0, var3);
         }
      }
   }

   public static boolean iIlIlllllill(Object owner) {
      synchronized (lliiIiiill) {
         return iliiIiiill.IIillIiliIil(owner);
      }
   }
}
