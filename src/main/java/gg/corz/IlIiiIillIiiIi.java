package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiPredicate;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2261;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2480;
import net.minecraft.class_2561;
import net.minecraft.class_2588;
import net.minecraft.class_2596;
import net.minecraft.class_2623;
import net.minecraft.class_2673;
import net.minecraft.class_2680;
import net.minecraft.class_2703;
import net.minecraft.class_2716;
import net.minecraft.class_2767;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3481;
import net.minecraft.class_638;
import net.minecraft.class_7439;
import net.minecraft.class_746;
import net.minecraft.class_7828;
import net.minecraft.class_2703.class_2705;
import net.minecraft.class_2703.class_5893;

public final class IlIiiIillIiiIi {
   private final ConcurrentLinkedQueue<ilIlIlIiIiIlIlIi> lililIiiiiililIiii = new ConcurrentLinkedQueue<>();
   private final Map<UUID, Long> iiiilIiiiIIIIiIiii;
   private final Set<UUID> IlIIiIiiillIIiIiii;
   static final long liillIiiiiiillIiii = 2000L;
   private final Map<UUID, Long> IiiilIiiiliiilIiii;
   private class_638 liIIiIiiiiiIIiIiii;
   static final double IlillIiiillillIiii = 8.0;
   static BiPredicate<UUID, String> illilIiiiIililIiii = IlIiiIillIiiIi::Ililllililil;
   static final long IIIilIiiilIIilIiii = 3000L;
   static final long llIilIiiiilIilIiii = 5000L;
   static final int lIillIiiiiIillIiii = 4096;
   static final int IllilIiiilllilIiii = 4096;
   private final Map<UUID, liIiIIlliiIiIIll> lliilIiiiiliilIiii;
   private int IIlIiIiiilIlIiIiii;
   static final double ilillIiiiIiillIiii = 17.0;
   private final Map<Integer, liIiIIlliiIiIIll> iIiilIiiiIliilIiii;
   private final Map<String, Long> lIIIiIiiiiIIIiIiii;
   private final List<lilIIIiliilIIIil> ilIIiIiiiIiIIiIiii;
   static final long iIIilIiiiIlIilIiii = 2000L;
   static final double IiIilIiiiliIilIiii = 160.0;
   private final AtomicInteger IIiilIiiilIiilIiii = new AtomicInteger();
   static final int iiIilIiiiIIlilIiii = 16;
   static final int lIlilIiiiiIlilIiii = 12;

   private void iIlIlllllill(ilIlIlIiIiIlIlIi e) {
      this.IIiilIiiilIiilIiii.incrementAndGet();
      this.lililIiiiiililIiii.offer(e);
   }

   static String lIiiIiIlilli(class_2561 text) {
      if (text == null || !(text.method_10851() instanceof class_2588 var1)) {
         return null;
      } else if (Iiiiliiiiiii<"Iiiiliiiiiii","Cdc/oUIMttFHb+ktU95iakUjvhJUBJOZ2LHkSqjrPbMuZWz1KbYqxWUhkcQVUCc8Vpop">().equals(var1.method_11022())
         && var1.method_11023().length != 0) {
         Object var4 = var1.method_11023()[0];
         return var4 instanceof class_2561 var3 ? var3.getString() : String.valueOf(var4);
      } else {
         return null;
      }
   }

   public void liiiIIllIl(class_2596<?> packet) {
      if (this.IIiilIiiilIiilIiii.get() < 4096) {
         long var2 = System.currentTimeMillis();
         if (packet instanceof class_2767 var4) {
            String var11;
            try {
               var11 = ((class_3414)var4.method_11894().comp_349()).comp_3319().method_12832();
            } catch (Throwable var13) {
               return;
            }

            boolean var12 = var4.method_11888() == class_3419.field_15245;
            if (lIIilliIIill.IliIlllilIi(var11, var12) == null) {
               return;
            }

            this.iIlIlllllill(
               new ilIlIlIiIiIlIlIi(
                  IIllliilIlllii.lIIlIliIIl, var11, var12 ? 1 : 0, 0, var4.method_11890(), var4.method_11889(), var4.method_11893(), null, null, var2
               )
            );
         } else if (packet instanceof class_2673 var5) {
            if (lIIilliIIill.liiiIIllIl(var5.method_11532()) == null) {
               return;
            }

            if (var5.method_11532() == 2001 && IilliliilIIi(var5.method_11534())) {
               return;
            }

            class_2338 var14 = var5.method_11531();
            this.iIlIlllllill(
               new ilIlIlIiIiIlIlIi(
                  IIllliilIlllii.iIIlIliIIl,
                  null,
                  var5.method_11532(),
                  var5.method_11534(),
                  (double)var14.method_10263() + 0.5,
                  (double)var14.method_10264() + 0.5,
                  (double)var14.method_10260() + 0.5,
                  null,
                  null,
                  var2
               )
            );
         } else if (packet instanceof class_2623 var6) {
            lIilllliIillll var15 = iliIiiliiiii(var6.method_11295(), var6.method_11294(), var6.method_11296());
            if (var15 == null) {
               return;
            }

            class_2338 var19 = var6.method_11298();
            this.iIlIlllllill(
               new ilIlIlIiIiIlIlIi(
                  IIllliilIlllii.IlIlIliIIl,
                  var15.name(),
                  0,
                  0,
                  (double)var19.method_10263() + 0.5,
                  (double)var19.method_10264() + 0.5,
                  (double)var19.method_10260() + 0.5,
                  null,
                  null,
                  var2
               )
            );
         } else if (packet instanceof class_2716 var7) {
            this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.llIlIliIIl, null, 0, 0, 0.0, 0.0, 0.0, null, var7.method_36548().toIntArray(), var2));
         } else if (packet instanceof class_7828 var8) {
            for (UUID var20 : var8.comp_1105()) {
               this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.ilIlIliIIl, null, 0, 0, 0.0, 0.0, 0.0, var20, null, var2));
            }
         } else {
            if (packet instanceof class_2703 var9 && var9.method_46327().contains(class_5893.field_29136)) {
               for (class_2705 var21 : var9.method_46329()) {
                  this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.liIlIliIIl, null, 0, 0, 0.0, 0.0, 0.0, var21.comp_1106(), null, var2));
               }

               return;
            }

            if (packet instanceof class_7439 var10 && !var10.comp_906()) {
               String var17 = lIiiIiIlilli(var10.comp_763());
               if (var17 != null) {
                  this.iIlIlllllill(new ilIlIlIiIiIlIlIi(IIllliilIlllii.IiIlIliIIl, var17, 0, 0, 0.0, 0.0, 0.0, null, null, var2));
               }
            }
         }
      }
   }

   private boolean Iilllilliill(String ms, long name) {
      Long var4 = this.lIIIiIiiiiIIIiIiii.get(ms.toLowerCase(Locale.ROOT));
      return var4 != null && Math.abs(name - var4) <= (1251226725064000222L ^ 1251226725064000782L);
   }

   private void IIillIiliIil(liIiIIlliiIiIIll s, lliIIIliliIIIl book, long now) {
      if (!s.lIIIiIllll && !this.IlIIiIiiillIIiIiii.contains(s.lliilIllll) && illilIiiiIililIiii.test(s.lliilIllll, s.iliilIllll)) {
         book.iliIiiliiiii(
            lIilllliIillll.iIiiiiiilIliiiiiil,
            (int)Math.floor(s.IiiilIllll),
            (int)Math.floor(s.liiilIllll),
            (int)Math.floor(s.iiiilIllll),
            Iiiiliiiiiii<"Iiiiliiiiiii","kX9lrrU4ZyRGjNI/i7JbURhyuxE06NXXJFtiANLZ0PajZI8=">()
               + s.lliilIllll
               + Iiiiliiiiiii<"Iiiiliiiiiii","nUBd/DIef6CxV3kn4a73xH6JmB5hu9RCiQXh0ak=">()
               + now / (453981766192429720L ^ 453981766192435448L),
            lIilllliIillll.iIiiiiiilIliiiiiil.IlIIIIIIillIIIIIIi,
            s.iliilIllll + Iiiiliiiiiii<"Iiiiliiiiiii","ZZQq1bRXJSM7Eh8bf9gD+OcEWvdZFXao1G73nN2TU1lx1VdTxAt2Ox7ttcY=">(),
            now
         );
      }
   }

   static boolean IilliliilIIi(int rawState) {
      try {
         class_2680 var1 = class_2248.method_9531(rawState);
         return var1.method_26204() instanceof class_2261
            || var1.method_26164(class_3481.field_15503)
            || var1.method_26164(class_3481.field_20339)
            || var1.method_26164(class_3481.field_20341)
            || var1.method_27852(class_2246.field_10479)
            || var1.method_27852(class_2246.field_10214)
            || var1.method_27852(class_2246.field_10219)
            || var1.method_27852(class_2246.field_10477)
            || var1.method_27852(class_2246.field_10195)
            || var1.method_27852(class_2246.field_10424)
            || var1.method_27852(class_2246.field_10362);
      } catch (Throwable var2) {
         return false;
      }
   }

   private boolean Illlllllilll(ilIlIlIiIiIlIlIi e) {
      if (this.liIIiIiiiiiIIiIiii == null) {
         return false;
      } else {
         try {
            return !this.liIIiIiiiiiIIiIiii
               .method_8390(
                  class_1646.class,
                  new class_238(
                     e.IiIIIIIIIi - Double.longBitsToDouble(-2497494407450977465L ^ -7113684025505735865L),
                     e.liIIIIIIIi - Double.longBitsToDouble(8856346288014462012L ^ 4242408469773388860L),
                     e.iiIIIIIIIi - Double.longBitsToDouble(4658355147609178681L ^ 51172728809161273L),
                     e.IiIIIIIIIi + Double.longBitsToDouble(8785023684722505832L ^ 4177841265922488424L),
                     e.liIIIIIIIi + Double.longBitsToDouble(-4484921231384856914L ^ -9094355449998559570L),
                     e.iiIIIIIIIi + Double.longBitsToDouble(5600752589940972647L ^ 984562971886214247L)
                  ),
                  v -> true
               )
               .isEmpty();
         } catch (Throwable var3) {
            return false;
         }
      }
   }

   void IlIlllIlilIl(int z, UUID now, String entityId, double id, double name, double y, long x) {
      long var14 = -7972478419820749554L;
      var14 ^= ((long)(!this.IlIIiIiiillIIiIiii.contains(now) && illilIiiiIililIiii.test(now, entityId) ? 0 : 1) << 32 ^ var14) & -1L << 32;
      if ((int)(var14 >>> 32) != 0 && this.IlIIiIiiillIIiIiii.size() < (((1324583265 ^ -19) + 89) * 81 ^ 82939509)) {
         this.IlIIiIiiillIIiIiii.add(now);
      }

      Long var13 = this.iiiilIiiiIIIIiIiii.remove(now);
      if (var13 != null && x - var13 <= (3928527012096018482L ^ 3928527012096017290L) && (int)(var14 >>> 32) == 0) {
         this.ilIIiIiiiIiIIiIiii
            .add(
               new lilIIIiliilIIIil(
                  now, entityId, (int)Math.floor(id), (int)Math.floor(name), (int)Math.floor(y), x + (-365779106515828113L ^ -365779106515827265L)
               )
            );
      }

      this.iIiilIiiiIliilIiii.put(z, new liIiIIlliiIiIIll(now, entityId, id, name, y, x, (boolean)((int)(var14 >>> 32))));
   }

   static boolean Ililllililil(UUID name, String id) {
      try {
         if (id != null) {
            for (String var5 : lllIIIIiillIIIIi.liIIiiIiil) {
               if (var5 != null && var5.trim().equalsIgnoreCase(id)) {
                  return false;
               }
            }
         }

         return lllIIIIiillIIIIi.iiiIlIIIll(name, id) ? false : id == null || !iIIiIiIlIlIiIiIl.IliIlllilIi(id);
      } catch (Throwable var6) {
         return false;
      }
   }

   void IIlllIlliIll(ilIlIlIiIiIlIlIi sx, double book, double e, double sz, lliIIIliliIIIl now, long sy) {
      switch (sx.iIIIIIIIIi) {
         case ilIlIliIIl:
            Iiilliiliiil(lIIilliIIill.IliIlllilIi(sx.IlIIIIIIIi, sx.llIIIIIIIi == 1), sx, book, e, sz, now, sy);
            break;
         case llIlIliIIl:
            if (sx.llIIIIIIIi == 1500 && this.Illlllllilll(sx)) {
               return;
            }

            Iiilliiliiil(lIIilliIIill.liiiIIllIl(sx.llIIIIIIIi), sx, book, e, sz, now, sy);
            break;
         case iIIlIliIIl:
            Iiilliiliiil(lIilllliIillll.valueOf(sx.IlIIIIIIIi), sx, book, e, sz, now, sy);
            break;
         case IiIlIliIIl:
            for (int var14 : sx.lIlIIIIIIi) {
               liIiIIlliiIiIIll var15 = this.iIiilIiiiIliilIiii.remove(var14);
               if (var15 != null) {
                  Long var16 = this.IiiilIiiiliiilIiii.remove(var15.lliilIllll);
                  if (var16 != null && Math.abs(sx.iIlIIIIIIi - var16) <= 2000L) {
                     this.IIillIiliIil(var15, now, sy);
                  } else if (this.Iilllilliill(var15.iliilIllll, sx.iIlIIIIIIi)) {
                     this.IIillIiliIil(var15, now, sy);
                  } else {
                     this.lliilIiiiiliilIiii
                        .put(
                           var15.lliilIllll,
                           new liIiIIlliiIiIIll(
                              var15.lliilIllll, var15.iliilIllll, var15.IiiilIllll, var15.liiilIllll, var15.iiiilIllll, sx.iIlIIIIIIi, var15.lIIIiIllll
                           )
                        );
                  }
               }
            }
            break;
         case IlIlIliIIl:
            liIiIIlliiIiIIll var17 = this.lliilIiiiiliilIiii.remove(sx.IIlIIIIIIi);
            if (var17 != null && Math.abs(sx.iIlIIIIIIi - var17.IIIIiIllll) <= 2000L) {
               this.IIillIiliIil(var17, now, sy);
            } else {
               this.IiiilIiiiliiilIiii.put(sx.IIlIIIIIIi, sx.iIlIIIIIIi);
            }

            this.ilIIiIiiiIiIIiIiii.removeIf(a -> a.iliIiIIIil.equals(sx.IIlIIIIIIi));
            break;
         case liIlIliIIl:
            this.lIIIiIiiiiIIIiIiii.put(sx.IlIIIIIIIi.toLowerCase(Locale.ROOT), sx.iIlIIIIIIi);
            Iterator var11 = this.lliilIiiiiliilIiii.values().iterator();

            while (var11.hasNext()) {
               liIiIIlliiIiIIll var12 = (liIiIIlliiIiIIll)var11.next();
               if (var12.iliilIllll.equalsIgnoreCase(sx.IlIIIIIIIi) && Math.abs(sx.iIlIIIIIIi - var12.IIIIiIllll) <= 2000L) {
                  var11.remove();
                  this.IIillIiliIil(var12, now, sy);
               }
            }
            break;
         case lIIlIliIIl:
            this.iiiilIiiiIIIIiIiii.put(sx.IIlIIIIIIi, sx.iIlIIIIIIi);
      }
   }

   public void IIIllIIliIIl(class_638 now, class_746 self, lliIIIliliIIIl w, long book) {
      this.liIIiIiiiiiIIiIiii = now;
      double var6 = self.method_23317();
      double var8 = self.method_23321();

      for (class_1657 var11 : now.method_18456()) {
         if (var11 != self) {
            double var12 = var11.method_23317() - var6;
            double var14 = var11.method_23321() - var8;
            if (!(var12 * var12 + var14 * var14 > 25600.0)) {
               this.IlIlllIlilIl(
                  var11.method_5628(), var11.method_5667(), var11.method_7334().name(), var11.method_23317(), var11.method_23318(), var11.method_23321(), book
               );
            }
         }
      }

      this.IiIlliIliiIl(w, book);
      int var17 = 512;

      ilIlIlIiIiIlIlIi var16;
      while (var17-- > 0 && (var16 = this.lililIiiiiililIiii.poll()) != null) {
         this.IIiilIiiilIiilIiii.decrementAndGet();
         this.IIlllIlliIll(var16, self.method_23317(), self.method_23318(), self.method_23321(), w, book);
      }

      this.iIiilIiiiIliilIiii.values().removeIf(s -> book - s.IIIIiIllll > 5000L);
      this.lliilIiiiiliilIiii.values().removeIf(s -> book - s.IIIIiIllll > 2000L);
      this.IiiilIiiiliiilIiii.values().removeIf(nowx -> book - nowx > 2000L);
      this.iiiilIiiiIIIIiIiii.values().removeIf(t -> book - t > 3000L);
      this.lIIIiIiiiiIIIiIiii.values().removeIf(t -> book - t > 2000L);
      if (++this.IIlIiIiiilIlIiIiii % 40 == 0) {
         this.IIIilIIiiIIi(self, w, book);
      }
   }

   void IiIlliIliiIl(lliIIIliliIIIl now, long book) {
      Iterator var4 = this.ilIIiIiiiIiIIiIiii.iterator();

      while (var4.hasNext()) {
         lilIIIiliilIIIil var5 = (lilIIIiliilIIIil)var4.next();
         if (book >= var5.lIIliIIIil) {
            var4.remove();
            if (!this.IlIIiIiiillIIiIiii.contains(var5.iliIiIIIil) && illilIiiiIililIiii.test(var5.iliIiIIIil, var5.IiiIiIIIil)) {
               now.iliIiiliiiii(
                  lIilllliIillll.lliiiiiililiiiiiil,
                  var5.liiIiIIIil,
                  var5.iiiIiIIIil,
                  var5.IIIliIIIil,
                  Iiiiliiiiiii<"Iiiiliiiiiii","ccuW24qxJuTy4585VX2P9jkHouq4Twvhvta2EaEIu6MWgA==">()
                     + var5.iliIiIIIil
                     + Iiiiliiiiiii<"Iiiiliiiiiii","nUBd/DIef6CxV3kn4a73xH6JmB5hu9RCiQXh0ak=">()
                     + var5.lIIliIIIil / 60000L,
                  lIilllliIillll.lliiiiiililiiiiiil.IlIIIIIIillIIIIIIi,
                  var5.IiiIiIIIil + Iiiiliiiiiii<"Iiiiliiiiiii","jf0gf3RRpH9PadU0eSoiscPlbq5RmwjW9bufld+ESD03t5mb1kdVqkCylw==">(),
                  book
               );
            } else {
               this.IlIIiIiiillIIiIiii.add(var5.iliIiIIIil);
            }
         }
      }
   }

   private static void Iiilliiliiil(lIilllliIillll sz, ilIlIlIiIiIlIlIi sx, double clue, double now, double book, lliIIIliliIIIl e, long sy) {
      long var22 = 5716560906540543433L;
      long var24 = 6942493655879992236L;
      if (sz != null) {
         double var11 = sx.IiIIIIIIIi - clue;
         double var13 = sx.liIIIIIIIi - now;
         double var15 = sx.iiIIIIIIIi - book;
         double var17 = sz == lIilllliIillll.liliiiiiliiliiiiil
            ? Double.longBitsToDouble(-1527605375634642780L ^ -6125499120203208540L)
            : Double.longBitsToDouble(-2238190976081451015L ^ -6858884193763579911L);
         if (!(var11 * var11 + var13 * var13 + var15 * var15 <= var17 * var17)) {
            var22 ^= ((long)((int)Math.floor(sx.IiIIIIIIIi)) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)((int)Math.floor(sx.liIIIIIIIi)) ^ var22) & -1L >>> 32;
            var24 ^= ((long)((int)Math.floor(sx.iiIIIIIIIi)) << 32 ^ var24) & -1L << 32;
            e.lIiiIiIlilli(
               sz,
               (int)(var22 >>> 32),
               (int)var22,
               (int)(var24 >>> 32),
               Iiiiliiiiiii<"Iiiiliiiiiii","ggMtPc/mNq7qNi10+A/HyTLBVFwV/2DIdMwgUw44AOI=">()
                  + sz.ordinal()
                  + Iiiiliiiiiii<"Iiiiliiiiiii","nUBd/DIef6CxV3kn4a73xH6JmB5hu9RCiQXh0ak=">()
                  + (int)(var22 >>> 32)
                  + Iiiiliiiiiii<"Iiiiliiiiiii","o9DT2yJ6JnI497XI/vVPQTHZXZ3QEWz8Co202Rc=">()
                  + (int)var22
                  + Iiiiliiiiiii<"Iiiiliiiiiii","o9DT2yJ6JnI497XI/vVPQTHZXZ3QEWz8Co202Rc=">()
                  + (int)(var24 >>> 32)
                  + Iiiiliiiiiii<"Iiiiliiiiiii","nUBd/DIef6CxV3kn4a73xH6JmB5hu9RCiQXh0ak=">()
                  + sx.iIlIIIIIIi / (-6928045380134841686L ^ -6928045380134881078L),
               sy
            );
         }
      }
   }

   static lIilllliIillll iliIiiliiiii(class_2248 block, int type, int data) {
      if (block == class_2246.field_10560 || block == class_2246.field_10615) {
         return lIilllliIillll.iiIiiiiilIIliiiiil;
      } else if (block == class_2246.field_10179) {
         return lIilllliIillll.iiIiiiiilIIliiiiil;
      } else {
         boolean var3 = block == class_2246.field_10034 || block == class_2246.field_10380 || block == class_2246.field_10443 || block instanceof class_2480;
         return var3 && type == 1 && data > 0 ? lIilllliIillll.IiIiiiiilliIiiiiil : null;
      }
   }

   private void IIIilIIiiIIi(class_746 now, lliIIIliliIIIl self, long book) {
      int var5 = now.method_31477() >> 4;
      int var6 = now.method_31479() >> 4;

      try {
         for (iIiilIllIliilIll var8 : liilliIiiiilliIi.ilIiiliIIi.iIliiliIIi.values()) {
            if (Math.abs(var8.liIiIlilll - var5) <= 12
               && Math.abs(var8.iiIiIlilll - var6) <= 12
               && (Math.abs(var8.liIiIlilll - var5) > 1 || Math.abs(var8.iiIiIlilll - var6) > 1)) {
               for (int var9 = 1; var9 <= var8.IIliIlilll; var9++) {
                  int var10 = (var8.lIliIlilll + (var9 - 1)) * 16;
                  if (var10 + 15 >= 16) {
                     break;
                  }

                  if (var8.iIliIlilll[var9] == lilIlIiiilIlIi.IlIlIlIiillIlIlIii) {
                     self.lIiiIiIlilli(
                        lIilllliIillll.Iiiiiiiilliiiiiiil,
                        var8.liIiIlilll * 16 + 8,
                        var10 + 8,
                        var8.iiIiIlilll * 16 + 8,
                        Iiiiliiiiiii<"Iiiiliiiiiii","meSA1/D0fftADK6G+63epa8QlISBNlRiaaWOoHuvPQ8=">()
                           + var8.liIiIlilll
                           + Iiiiliiiiiii<"Iiiiliiiiiii","o9DT2yJ6JnI497XI/vVPQTHZXZ3QEWz8Co202Rc=">()
                           + var8.iiIiIlilll,
                        book
                     );
                     break;
                  }
               }
            }
         }
      } catch (Throwable var11) {
      }
   }

   public IlIiiIillIiiIi() {
      this.iIiilIiiiIliilIiii = new HashMap<>();
      this.lliilIiiiiliilIiii = new HashMap<>();
      this.IiiilIiiiliiilIiii = new HashMap<>();
      this.iiiilIiiiIIIIiIiii = new HashMap<>();
      this.lIIIiIiiiiIIIiIiii = new HashMap<>();
      this.IlIIiIiiillIIiIiii = new HashSet<>();
      this.ilIIiIiiiIiIIiIiii = new ArrayList<>();
   }

   public void IliIlllilIi() {
      this.lililIiiiiililIiii.clear();
      this.IIiilIiiilIiilIiii.set(0);
      this.iIiilIiiiIliilIiii.clear();
      this.lliilIiiiiliilIiii.clear();
      this.IiiilIiiiliiilIiii.clear();
      this.iiiilIiiiIIIIiIiii.clear();
      this.lIIIiIiiiiIIIiIiii.clear();
      this.ilIIiIiiiIiIIiIiii.clear();
   }
}
