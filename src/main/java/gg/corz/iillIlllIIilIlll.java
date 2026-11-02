package gg.corz;

import com.corz.client.mixins.AccessorClientConnection;
import io.netty.channel.Channel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2661;
import net.minecraft.class_2678;
import net.minecraft.class_2708;
import net.minecraft.class_2724;
import net.minecraft.class_2987;
import net.minecraft.class_634;
import net.minecraft.class_8588;

public final class iillIlllIIilIlll {
   private static final iIIIIlIlIIIl<class_2596<?>> lIIliIIill = new iIIIIlIlIIIl<>(1000L);
   private static final ililliIiilli IlIliIIill = new ililliIiilli();
   private static final Object IIIliIIill = new Object();
   private static final AtomicBoolean iIIliIIill = new AtomicBoolean();
   private static class_2535 llIliIIill;

   private static boolean Ililllililil(class_2596<?> p) {
      return p instanceof class_2708 || p instanceof class_8588 || p instanceof class_2661 || p instanceof class_2678 || p instanceof class_2724;
   }

   public static void IlIlllIlilIl() {
      Iiilliiliiil(true);
   }

   private static void Iiilliiliiil(boolean all) {
      class_2535 var1;
      synchronized (IIIliIIill) {
         if (lIIliIIill.IliIlllilIi()) {
            return;
         }

         var1 = llIliIIill;
      }

      Channel var6 = IIIiillllIIiilll.IIlllIlliIll(var1);
      if (var6 != null) {
         if (all || iIIliIIill.compareAndSet(false, true)) {
            try {
               var6.eventLoop().execute(() -> {
                  if (!all) {
                     iIIliIIill.set(false);
                  }

                  List var2;
                  synchronized (IIIliIIill) {
                     if (llIliIIill != var1) {
                        return;
                     }

                     var2 = all ? lIIliIIill.IiIlliIliiIl() : lIIliIIill.IlIlllIlilIl(IIIiillllIIiilll.IliIlllilIi());
                     IIillIiliIil();
                  }

                  IIIilIIiiIIi(var1, var2);
               });
            } catch (RejectedExecutionException var4) {
               if (!all) {
                  iIIliIIill.set(false);
               }
            }
         }
      }
   }

   private static void IIIilIIiiIIi(class_2535 c, List<class_2596<?>> packets) {
      for (class_2596 var3 : packets) {
         if (!c.method_10758()) {
            return;
         }

         class_2547 var4 = c.method_10744();
         if (var4 instanceof class_634 && var4.method_52413(var3)) {
            try {
               AccessorClientConnection.corzHandlePacket(var3, var4);
            } catch (class_2987 var6) {
            } catch (RejectedExecutionException var7) {
               c.method_10747(
                  class_2561.method_43471(
                     IiIiliIiiiIi<"IiIiliIiiiIi","0ssMjQdjU5KRrLBY7Lc7ziX6JJQSjS1ka69CmOzU7zmPF1t8KHun9TlbxQlurXIkz69NGMkUUodfxS4dQpI5A5BV">()
                  )
               );
               return;
            } catch (ClassCastException var8) {
               c.method_10747(
                  class_2561.method_43471(
                     IiIiliIiiiIi<"IiIiliIiiiIi","4z0SMFJCLVPkKmFztpJWtoKq4G7H8hJMTgSy7RN6qs6vozNn6YJQFdo+qxohJJWsxVQZPOSkFHuXp/xfo7IMYkQ=">()
                  )
               );
               return;
            }
         }
      }
   }

   public static void IiIlliIliiIl() {
      synchronized (IIIliIIill) {
         Iilllilliill();
      }
   }

   public static boolean IIlllIlliIll(class_2535 p, class_2596<?> c) {
      long var18 = -3627016596555839440L;
      if (!IIIiillllIIiilll.IIIllIIliIIl(p)) {
         return false;
      } else {
         class_2547 var2 = p.method_10744();
         if (!(var2 instanceof class_634)) {
            IiIlliIliiIl();
            return false;
         } else {
            long var3 = IIIiillllIIiilll.IliIlllilIi();
            illIllilIilIllil.liiiIIllIl(c, var3);
            long var6;
            List var8;
            synchronized (IIIliIIill) {
               var6 = IlIliIIill.IliIlllilIi();
               if (llIliIIill != p) {
                  Iilllilliill();
               }

               var8 = lIIliIIill.IliIlllilIi() ? List.of() : lIIliIIill.IlIlllIlilIl(var3);
               IIillIiliIil();
            }

            IIIilIIiiIIi(p, var8);
            if (c instanceof class_2708) {
               IIIiillllIIiilll.iIIiiIlill = var3;
            }

            if (!Ililllililil(c) && !IIiIIllIiIIl.IliIlllilIi()) {
               synchronized (IIIliIIill) {
                  var18 ^= ((long)(!lIIliIIill.IliIlllilIi() ? 1 : 0) << 32 ^ var18) & -1L << 32;
               }

               ArrayList var27 = null;
               ArrayList var28 = null;

               for (ilIllIiIll var12 : llilIllililIll.IilliliilIIi()) {
                  if (var12 instanceof lIlliiIlli) {
                     lIlliiIlli var13 = (lIlliiIlli)var12;
                     if (var12.IliIlllilIi()) {
                        long var14;
                        try {
                           var14 = var13.iiiIlIIIll(c, (boolean)((int)(var18 >>> 32)), var3);
                        } catch (RuntimeException var23) {
                           continue;
                        }

                        if (var14 > var3) {
                           if (var27 == null) {
                              var27 = new ArrayList(2);
                              var28 = new ArrayList(2);
                           }

                           var27.add(var12);
                           var28.add(Math.min(var14, var3 + 1000L));
                        }
                     }
                  }
               }

               if ((int)(var18 >>> 32) == 0 && var27 == null) {
                  return false;
               } else {
                  synchronized (IIIliIIill) {
                     if (llIliIIill != p) {
                        Iilllilliill();
                     }

                     lIiIlliIiIll var30 = null;
                     if (var27 != null) {
                        for (long var33 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var33 < var27.size(); var33 ^= (var33 ^ var33 + (long)1) & -1L >>> 32) {
                           ilIllIiIll var31 = (ilIllIiIll)var27.get((int)var33);
                           long var15 = IlIliIIill.IilliliilIIi(var31, var6, (Long)var28.get((int)var33));
                           if (var15 > var3 && var31.IliIlllilIi()) {
                              if (var30 == null) {
                                 var30 = lIIliIIill.iIlIlllllill(c, var3);
                              }

                              var30.IilliliilIIi(var31, var15);
                           }
                        }
                     }

                     if (var30 == null) {
                        if (lIIliIIill.IliIlllilIi()) {
                           return false;
                        }

                        lIIliIIill.iIlIlllllill(c, var3);
                     }

                     llIliIIill = p;
                     return true;
                  }
               }
            } else {
               List var25;
               synchronized (IIIliIIill) {
                  var25 = lIIliIIill.IiIlliIliiIl();
                  IIillIiliIil();
               }

               IIIilIIiiIIi(p, var25);
               if (c instanceof class_2708 || c instanceof class_8588 || c instanceof class_2661) {
                  iiIliillIIlliill.IiIlliIliiIl();
               }

               return false;
            }
         }
      }
   }

   public static long IilliliilIIi() {
      synchronized (IIIliIIill) {
         return lIIliIIill.Ililllililil(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   private static void IIillIiliIil() {
      if (lIIliIIill.IliIlllilIi()) {
         llIliIIill = null;
      }
   }

   static void Illlllllilll() {
      synchronized (IIIliIIill) {
         if (lIIliIIill.IliIlllilIi()) {
            return;
         }

         if (!IIIiillllIIiilll.IiIlliIliiIl(llIliIIill)) {
            Iilllilliill();
            return;
         }
      }

      Iiilliiliiil(false);
   }

   public static void lIiiIiIlilli(Object owner) {
      synchronized (IIIliIIill) {
         IlIliIIill.liiiIIllIl(owner);
         lIIliIIill.Illlllllilll(owner);
      }

      Iiilliiliiil(false);
   }

   private iillIlllIIilIlll() {
   }

   private static void Iilllilliill() {
      lIIliIIill.IIlllIlliIll();
      llIliIIill = null;
   }

   public static int iIlIlllllill() {
      synchronized (IIIliIIill) {
         return lIIliIIill.liiiIIllIl();
      }
   }

   public static boolean IliIlllilIi() {
      synchronized (IIIliIIill) {
         return !lIIliIIill.IliIlllilIi();
      }
   }

   public static boolean liiiIIllIl(Object owner) {
      synchronized (IIIliIIill) {
         return lIIliIIill.IIillIiliIil(owner);
      }
   }

   public static void iliIiiliiiii(Object latestUntilMs, long owner) {
      synchronized (IIIliIIill) {
         IlIliIIill.iIlIlllllill(latestUntilMs, owner);
         lIIliIIill.Iilllilliill(latestUntilMs, owner);
      }

      Iiilliiliiil(false);
   }

   public static void IIIllIIliIIl() {
      Iiilliiliiil(false);
   }
}
