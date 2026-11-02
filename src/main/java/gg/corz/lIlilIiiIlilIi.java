package gg.corz;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_2616;
import net.minecraft.class_2620;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2663;
import net.minecraft.class_2664;
import net.minecraft.class_2680;
import net.minecraft.class_2716;
import net.minecraft.class_2761;
import net.minecraft.class_6880;
import net.minecraft.class_8038;
import net.minecraft.class_8110;
import net.minecraft.class_8143;

public final class lIlilIiiIlilIi {
   private static final byte IiiliiIiiliiliiIii = 35;
   public static final String lliliiIiiililiiIii = "?";
   public static final int iIiliiIiiIliliiIii = 2048;
   private final AtomicInteger lIIiiiIiiiIIiiiIii;
   private final ConcurrentLinkedQueue<Object> iiiliiIiiIIIiiiIii = new ConcurrentLinkedQueue<>();

   private void IlIlllIlilIl(Object item) {
      if (this.lIIiiiIiiiIIiiiIii.incrementAndGet() > 2048) {
         this.lIIiiiIiiiIIiiiIii.decrementAndGet();
      } else {
         this.iiiliiIiiIIIiiiIii.add(item);
      }
   }

   public void iIlIlllllill() {
      while (this.iiiliiIiiIIIiiiIii.poll() != null) {
         this.lIIiiiIiiiIIiiiIii.decrementAndGet();
      }
   }

   static boolean iliIiiliiiii(class_2680 state) {
      return state == null
         ? false
         : state.method_26215()
            || state.method_27852(class_2246.field_23152)
            || state.method_27852(class_2246.field_10171)
            || state.method_27852(class_2246.field_10540)
            || state.method_27852(class_2246.field_22423);
   }

   public lIlilIiiIlilIi() {
      this.lIIiiiIiiiIIiiiIii = new AtomicInteger();
   }

   private void IilliliilIIi(class_2596<?> packet) {
      if (packet != null) {
         if (packet instanceof class_2663 var2) {
            if (var2.method_11470() == 35) {
               this.IlIlllIlilIl(var2);
            }
         } else if (packet instanceof class_8143 var3) {
            this.IlIlllIlilIl(
               new IIlilIIllIlilIIl(
                  var3.comp_1267(), var3.comp_1269(), var3.comp_1270(), (class_243)var3.comp_1271().orElse(null), IiIlliIliiIl(var3.comp_1268())
               )
            );
         } else if (packet instanceof class_2604 var4) {
            class_1299 var11 = var4.method_11169();
            if (var11 == class_1299.field_6110 || var11 == class_1299.field_6082) {
               this.IlIlllIlilIl(
                  new iIIIiilIlIIiil(var4.method_11167(), var11, var4.method_11175(), var4.method_11174(), var4.method_11176(), var4.method_11166())
               );
            }
         } else if (packet instanceof class_2716 var5) {
            this.IlIlllIlilIl(new liIIlliiiIIlli(var5.method_36548().toIntArray()));
         } else if (packet instanceof class_2664 var6) {
            this.IlIlllIlilIl(new iIIlIlilIlIlIlil(var6.comp_2883(), var6.comp_4594()));
         } else if (packet instanceof class_2616 var7) {
            if (var7.method_11267() == 0) {
               this.IlIlllIlilIl(new ilIiIiIiIiIiIiIi(var7.method_11269()));
            }
         } else if (packet instanceof class_2761) {
            this.IlIlllIlilIl(new IiIiliIiiiIi(IIIiillllIIiilll.IliIlllilIi()));
         } else if (packet instanceof class_2626 var8) {
            this.lIiiIiIlilli(var8.method_11309(), var8.method_11308());
         } else if (packet instanceof class_2637 var9) {
            var9.method_30621(this::lIiiIiIlilli);
         } else if (packet instanceof class_2620 var10 && var10.method_11277() != null) {
            this.IlIlllIlilIl(new iIIlllllIlIlllll(var10.method_11280(), var10.method_11277().method_10062(), var10.method_11278()));
         }
      }
   }

   public int liiiIIllIl(class_1937 world, Consumer<IlIillIiilIi> sink, int max) {
      long var7 = 8198979175148206724L;
      if (sink == null) {
         return 0;
      } else {
         var7 ^= (0L ^ var7) & -1L << 32;

         while ((int)(var7 >>> 32) < max) {
            Object var5 = this.iiiliiIiiIIIiiiIii.poll();
            if (var5 == null) {
               break;
            }

            this.lIIiiiIiiiIIiiiIii.decrementAndGet();
            IlIillIiilIi var6 = IIlllIlliIll(world, var5);
            if (var6 != null) {
               sink.accept(var6);
               var7 += 4294967296L;
            }
         }

         return (int)(var7 >>> 32);
      }
   }

   static String IiIlliIliiIl(class_6880<class_8110> type) {
      return type == null
         ? Iilllilliill<"Iilllilliill","l51Mc4eIukkpQ0yOmQMnya4xbySGHgcxUyXk3fY=">()
         : type.method_40230().map(k -> k.method_29177().method_12832()).orElse(Iilllilliill<"Iilllilliill","l51Mc4eIukkpQ0yOmQMnya4xbySGHgcxUyXk3fY=">());
   }

   public static boolean IIIllIIliIIl(int stage) {
      return stage < 0 || stage > 9;
   }

   public void IliIlllilIi(class_2596<?> packet) {
      if (!(packet instanceof class_8038 var2)) {
         this.IilliliilIIi(packet);
      } else {
         for (class_2596 var4 : var2.method_48324()) {
            this.IilliliilIIi(var4);
         }
      }
   }

   private void lIiiIiIlilli(class_2338 state, class_2680 pos) {
      if (state != null && iliIiiliiiii(pos)) {
         this.IlIlllIlilIl(new IllIliIilllIliIi(state.method_10062(), pos));
      }
   }

   private static IlIillIiilIi IIlllIlliIll(class_1937 raw, Object world) {
      if (world instanceof IlIillIiilIi) {
         return (IlIillIiilIi)world;
      } else if (world instanceof class_2663 var2) {
         if (raw == null) {
            return null;
         } else {
            class_1297 var3 = var2.method_11469(raw);
            return var3 == null ? null : new llIiIIliilIiIIli(var3.method_5628());
         }
      } else {
         return null;
      }
   }
}
