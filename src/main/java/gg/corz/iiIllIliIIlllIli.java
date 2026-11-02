package gg.corz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1684;
import net.minecraft.class_1937;
import net.minecraft.class_243;

public final class iiIllIliIIlllIli {
   public static final int IIillIllIi = 200;
   private final LinkedHashMap<Integer, Long> liillIllIi;
   public static final int iIillIllIi = 10;
   private final LinkedHashMap<Integer, Long> iiillIllIi;
   private long IIIilIllIi;
   private final LinkedHashMap<Integer, ililIlIiIiilIlIi> IiillIllIi;
   public static final int lIillIllIi = 3;
   private final LinkedHashMap<Integer, liilIliiilIl> ilillIllIi = new LinkedHashMap<>();
   public static final int iilllIllIi = 2;
   public static final int IlillIllIi = 32;
   public static final int llillIllIi = 40;

   public List<ililIlIiIiilIlIi> IiIlliIliiIl(int selfId) {
      ArrayList var2 = new ArrayList();

      for (liilIliiilIl var4 : this.ilillIllIi.values()) {
         if (var4.llIlIillilIlIill != selfId && var4.iiIlIillIIllIill != null) {
            var2.add(var4.iiIlIillIIllIill);
         }
      }

      return var2;
   }

   public void IliIlllilIi() {
      this.ilillIllIi.clear();
      this.IiillIllIi.clear();
      this.liillIllIi.clear();
      this.iiillIllIi.clear();
      this.IIIilIllIi = Long.MIN_VALUE;
   }

   private void Iilllilliill(long tick) {
      Iterator var3 = this.liillIllIi.entrySet().iterator();

      while (var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         if (tick - (Long)var4.getValue() > 40L || this.IiillIllIi.size() > 32) {
            this.IiillIllIi.remove(var4.getKey());
            var3.remove();
         }
      }

      this.iiillIllIi.entrySet().removeIf(tickx -> tick - tickx.getValue() > 40L || !this.IiillIllIi.containsKey(tickx.getKey()));
   }

   public void iIlIlllllill(int[] ids) {
      this.IilliliilIIi(ids, Long.MIN_VALUE);
   }

   public ililIlIiIiilIlIi iliIiiliiiii(int ownerId) {
      ililIlIiIiilIlIi var2 = null;
      long var3 = Long.MIN_VALUE;

      for (liilIliiilIl var6 : this.ilillIllIi.values()) {
         if (var6.llIlIillilIlIill == ownerId && var6.iiIlIillIIllIill != null && (var2 == null || var6.IiIlIillliIlIill >= var3)) {
            var2 = var6.iiIlIillIIllIill;
            var3 = var6.IiIlIillliIlIill;
         }
      }

      return var2;
   }

   public boolean IlIlllIlilIl(class_243 pos, double selfId, int radius) {
      if (pos == null) {
         return false;
      } else {
         double var5 = selfId * selfId;

         for (liilIliiilIl var8 : this.ilillIllIi.values()) {
            if (var8.llIlIillilIlIill != radius && var8.iiIlIillIIllIill != null && var8.iiIlIillIIllIill.iIlIlllllill().method_1025(pos) <= var5) {
               return true;
            }
         }

         return false;
      }
   }

   public ililIlIiIiilIlIi IIIllIIliIIl(int pearlId) {
      liilIliiilIl var2 = this.ilillIllIi.get(pearlId);
      return var2 != null ? var2.iiIlIillIIllIill : this.IiillIllIi.get(pearlId);
   }

   public void lIiiIiIlilli(long world, class_1937 tick) {
      long var16 = 2811164769829075946L;
      long var14 = 6305374007791471945L;
      this.Iilllilliill(world);
      if (tick != null && !this.ilillIllIi.isEmpty()) {
         var14 ^= ((long)(this.IIIilIllIi != Long.MIN_VALUE && world - this.IIIilIllIi < 2L && world >= this.IIIilIllIi ? 0 : 1) << 32 ^ var14) & -1L << 32;
         Iterator var5 = this.ilillIllIi.entrySet().iterator();

         while (var5.hasNext()) {
            liilIliiilIl var6 = (liilIliiilIl)((Map.Entry)var5.next()).getValue();
            if ((int)(var14 >>> 32) != 0 || var6.iiIlIillIIllIill == null) {
               if (tick.method_8469(var6.iIIlIillIlIlIill) instanceof class_1684 var8 && !var8.method_31481()) {
                  lIililiIilil var9 = liIiililiiIiilil.IilliliilIIi(var8, true, 200);
                  if (var9 != null && var9.iIilIIiiIlilIIii && var9.IiIlIIiiliIlIIii != null) {
                     List var10 = var9.liiIIIiiiiiIIIii;
                     ArrayList var11 = new ArrayList(4);
                     var14 ^= ((long)Math.max(0, var10.size() - 3 - 1) ^ var14) & -1L >>> 32;

                     for (var16 ^= ((long)((int)var14) << 32 ^ var16) & -1L << 32; (int)(var16 >>> 32) < var10.size(); var16 += 4294967296L) {
                        var11.add((class_243)var10.get((int)(var16 >>> 32)));
                     }

                     var6.iiIlIillIIllIill = new ililIlIiIiilIlIi(
                        var6.iIIlIillIlIlIill, var6.llIlIillilIlIill, var9.IiIlIIiiliIlIIii, Math.max(0, var9.lIllIIiiiIllIIii), List.copyOf(var11), world
                     );
                     var6.lIllIilliIllIill = world;
                     continue;
                  }

                  var6.iiIlIillIIllIill = null;
                  continue;
               }

               if (var6.iiIlIillIIllIill != null || world - var6.IiIlIillliIlIill > 10L) {
                  if (var6.iiIlIillIIllIill != null) {
                     this.IiillIllIi.put(Integer.valueOf(var6.iIIlIillIlIlIill), var6.iiIlIillIIllIill);
                     this.liillIllIi.put(Integer.valueOf(var6.iIIlIillIlIlIill), Long.valueOf(world));
                     this.iiillIllIi.put(Integer.valueOf(var6.iIIlIillIlIlIill), Long.valueOf(world));
                  }

                  var5.remove();
               }
            }
         }

         if ((int)(var14 >>> 32) != 0) {
            this.IIIilIllIi = world;
         }
      }
   }

   public void liiiIIllIl(int entityId, int ownerId, long tick) {
      if (this.ilillIllIi.size() >= 32) {
         Iterator var5 = this.ilillIllIi.keySet().iterator();
         var5.next();
         var5.remove();
      }

      this.ilillIllIi.put(Integer.valueOf(entityId), new liilIliiilIl(entityId, ownerId, tick));
   }

   public void IilliliilIIi(int[] ids, long tick) {
      long var9 = -1233717344955874443L;
      long var11 = -5386227828283326008L;
      if (ids != null) {
         int[] var4 = ids;
         var9 ^= ((long)ids.length << 32 ^ var9) & -1L << 32;

         for (long var14 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            var11 ^= ((long)var4[(int)var14] << 32 ^ var11) & -1L << 32;
            liilIliiilIl var8 = this.ilillIllIi.remove(Integer.valueOf((int)(var11 >>> 32)));
            if (var8 != null && var8.iiIlIillIIllIill != null) {
               this.IiillIllIi.put(Integer.valueOf((int)(var11 >>> 32)), var8.iiIlIillIIllIill);
               this.liillIllIi.put(Integer.valueOf((int)(var11 >>> 32)), Long.valueOf(var8.iiIlIillIIllIill.iliIiiliiiii()));
               if (tick != Long.MIN_VALUE) {
                  this.iiillIllIi.put(Integer.valueOf((int)(var11 >>> 32)), Long.valueOf(tick));
               }
            }
         }
      }
   }

   public boolean IIlllIlliIll(int pearlId) {
      return this.ilillIllIi.containsKey(Integer.valueOf(pearlId));
   }

   public ililIlIiIiilIlIi Illlllllilll(int within, long ownerId, int tick) {
      ililIlIiIiilIlIi var5 = null;
      long var6 = Long.MIN_VALUE;

      for (Map.Entry var9 : this.iiillIllIi.entrySet()) {
         long var10 = (Long)var9.getValue();
         long var12 = ownerId - var10;
         if (var12 >= 0L && var12 <= (long)tick) {
            ililIlIiIiilIlIi var14 = this.IiillIllIi.get(var9.getKey());
            if (var14 != null && var14.liiiIIllIl() == within && (var5 == null || var10 >= var6)) {
               var5 = var14;
               var6 = var10;
            }
         }
      }

      return var5;
   }

   public iiIllIliIIlllIli() {
      this.IiillIllIi = new LinkedHashMap<>();
      this.liillIllIi = new LinkedHashMap<>();
      this.iiillIllIi = new LinkedHashMap<>();
      this.IIIilIllIi = Long.MIN_VALUE;
   }
}
