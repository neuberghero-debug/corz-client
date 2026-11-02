package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class iiilliIlIIIiliIl {
   private long ililiiiIll;
   private final LinkedHashMap<Long, liiiiiIiiiiiiiIi> IliliiiIll;
   private final HashMap<Long, Long> iIiliiiIll = new HashMap<>();
   private int lliliiiIll;
   private static final int[][] lIiliiiIll = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
   public static final int IIiliiiIll = 4096;
   public static final int iilliiiIll = 512;

   public long IiIiliIiiiIi() {
      return this.ililiiiIll;
   }

   public int IIIilIIiiIIi() {
      return this.lliliiiIll;
   }

   public IIiiiiillIiiiiil IiIlliIliiIl(long root) {
      liiiiiIiiiiiiiIi var3 = this.IliliiiIll.get(root);
      return var3 == null ? null : new IIiiiiillIiiiiil(root, Collections.unmodifiableSet(var3.IIIiiIIlIi), var3.lIIiiIIlIi, var3.iIIiiIIlIi, var3.IlIiiIIlIi);
   }

   public iiilliIlIIIiliIl() {
      this.IliliiiIll = new LinkedHashMap<>();
      this.ililiiiIll = Long.MIN_VALUE;
   }

   public int Ililllililil() {
      return this.IliliiiIll.size();
   }

   public long IIlllIlliIll(long target) {
      return this.iIiliiiIll.getOrDefault(target, Long.MIN_VALUE);
   }

   public static Map<Long, Long> liiiIIllIl(Collection<Long> radius, int cells) {
      return IilliliilIIi(radius, Math.max(0, cells), false);
   }

   public boolean Illlllllilll(long attemptsLimit, int root) {
      liiiiiIiiiiiiiIi var4 = this.IliliiiIll.get(attemptsLimit);
      return var4 != null && var4.lIIiiIIlIi >= root;
   }

   public static Map<Long, Long> IliIlllilIi(Collection<Long> cells) {
      return IilliliilIIi(cells, -1, false);
   }

   public Set<Long> IIillIiliIil(long root) {
      liiiiiIiiiiiiiIi var3 = this.IliliiiIll.get(root);
      return var3 == null ? Set.of() : Collections.unmodifiableSet(var3.IIIiiIIlIi);
   }

   public void IIlilIliiIli(long root) {
      liiiiiIiiiiiiiIi var3 = this.IliliiiIll.remove(Long.valueOf(root));
      if (var3 != null) {
         for (Long var5 : var3.IIIiiIIlIi) {
            this.iIiliiiIll.remove(var5);
         }

         if (this.ililiiiIll == root) {
            this.ililiiiIll = Long.MIN_VALUE;
         }
      }
   }

   private static Map<Long, Long> IilliliilIIi(Collection<Long> radius, int cells, boolean horizontal) {
      HashSet var3 = new HashSet(radius);
      HashMap var4 = new HashMap(Math.max(16, var3.size() * 2));
      ArrayDeque var5 = new ArrayDeque();
      ArrayList var6 = new ArrayList();

      for (Long var8 : radius) {
         if (var3.remove(var8)) {
            var6.clear();
            var5.add(var8);
            long var9 = var8;

            while (!var5.isEmpty()) {
               long var11 = (Long)var5.poll();
               var6.add(var11);
               if (var11 < var9) {
                  var9 = var11;
               }

               lIiiIiIlilli(var11, cells, horizontal, var3, var5);
            }

            for (Long var12 : var6) {
               var4.put(var12, var9);
            }
         }
      }

      return var4;
   }

   private static void lIiiIiIlilli(long pending, int horizontal, boolean radius, HashSet<Long> c, ArrayDeque<Long> queue) {
      long var17 = -1856493546228130521L;
      long var19 = 7545297902837514525L;
      long var15 = 2560044564732574430L;
      var15 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(pending) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(pending) ^ var15) & -1L >>> 32;
      var17 ^= ((long)llIiIiililIiIiil.Illlllllilll(pending) << 32 ^ var17) & -1L << 32;
      if (horizontal < 0) {
         int[][] var9 = lIiliiiIll;
         var17 ^= ((long)var9.length ^ var17) & -1L >>> 32;

         for (long var27 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var27 >>> 32) < (int)var17; var27 += 4294967296L) {
            int[] var21 = var9[(int)(var27 >>> 32)];
            long var13 = llIiIiililIiIiil.IIIllIIliIIl((int)(var15 >>> 32) + var21[0], (int)var15 + var21[1], (int)(var17 >>> 32) + var21[2]);
            if (c.remove(var13)) {
               queue.add(var13);
            }
         }
      } else {
         for (long var26 = var19 ^ ((long)(-horizontal) ^ var19) & -1L >>> 32; (int)var26 <= horizontal; var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
            for (var17 ^= ((long)(radius ? 0 : -horizontal) ^ var17) & -1L >>> 32;
               (int)var17 <= (radius ? 0 : horizontal);
               var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32
            ) {
               for (var26 ^= ((long)(-horizontal) << 32 ^ var26) & -1L << 32; (int)(var26 >>> 32) <= horizontal; var26 += 4294967296L) {
                  if ((int)var26 != 0 || (int)var17 != 0 || (int)(var26 >>> 32) != 0) {
                     long var12 = llIiIiililIiIiil.IIIllIIliIIl(
                        (int)(var15 >>> 32) + (int)var26, (int)var15 + (int)var17, (int)(var17 >>> 32) + (int)(var26 >>> 32)
                     );
                     if (c.remove(var12)) {
                        queue.add(var12);
                     }
                  }
               }
            }
         }
      }
   }

   public int Iilllilliill(long root, long epoch) {
      liiiiiIiiiiiiiIi var5 = this.IliliiiIll.get(root);
      return var5 != null && var5.iIIiiIIlIi == epoch ? var5.lIIiiIIlIi : 0;
   }

   public int Iiilliiliiil(int attemptsLimit) {
      long var5 = 3174183494592143127L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (liiiiiIiiiiiiiIi var4 : this.IliliiiIll.values()) {
         if (var4.lIIiiIIlIi >= attemptsLimit) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public int IlIillIiilIi() {
      return this.iIiliiiIll.size();
   }

   private void IIIllIIliIIl(long target, long prior) {
      liiiiiIiiiiiiiIi var5 = this.IliliiiIll.get(prior);
      if (var5 != null) {
         var5.IIIiiIIlIi.remove(target);
         if (var5.IIIiiIIlIi.isEmpty()) {
            this.IliliiiIll.remove(Long.valueOf(prior));
         }
      }
   }

   public static Map<Long, Long> iIlIlllllill(Collection<Long> cells, int radius) {
      return IilliliilIIi(cells, Math.max(0, radius), true);
   }

   public int iliIiiliiiii(long root, long epoch, long target) {
      liiiiiIiiiiiiiIi var7 = this.IliliiiIll.remove(Long.valueOf(epoch));
      if (var7 == null) {
         var7 = new liiiiiIiiiiiiiIi();
      }

      this.IliliiiIll.put(Long.valueOf(epoch), var7);

      while (this.IliliiiIll.size() > 512) {
         this.IlIlllIlilIl();
      }

      if (var7.iIIiiIIlIi != target) {
         var7.iIIiiIIlIi = target;
         var7.lIIiiIIlIi = 0;
      }

      var7.lIIiiIIlIi++;
      var7.IlIiiIIlIi++;
      this.lliliiiIll++;
      this.ililiiiIll = epoch;
      Long var8 = this.iIiliiiIll.get(root);
      if (var8 != null && var8 != epoch) {
         this.IIIllIIliIIl(root, var8);
      }

      if (var7.IIIiiIIlIi.size() < 4096 && var7.IIIiiIIlIi.add(root)) {
         this.iIiliiiIll.put(root, epoch);
      }

      return var7.lIIiiIIlIi;
   }

   public void Illillliilli() {
      this.IliliiiIll.clear();
      this.iIiliiiIll.clear();
      this.lliliiiIll = 0;
      this.ililiiiIll = Long.MIN_VALUE;
   }

   public String Iilililiiili() {
      liiiiiIiiiiiiiIi var1 = this.IliliiiIll.get(this.ililiiiIll);
      String var2 = var1 == null
         ? IIiilIiiiIii<"IIiilIiiiIii","31UgOAqoQ68udcCKXcQWdFcYrRtpoLV1wzwxv/A=">()
         : llIiIiililIiIiil.IlIlllIlilIl(this.ililiiiIll)
            + IIiilIiiiIii<"IIiilIiiiIii","hhdF1OMgNVDgLnAAbjUlBNxSCCW41k0ewS2RBJKClQ==">()
            + var1.IIIiiIIlIi.size()
            + IIiilIiiiIii<"IIiilIiiiIii","0rtevLzi/LerBxAiMd7Ty+A8lAO5IvCHp7izQ0l4dA==">()
            + var1.lIIiiIIlIi
            + IIiilIiiiIii<"IIiilIiiiIii","AAgIr79ei8N+PMzA1XGLBAL535AJ4Bw5ghoIDfU=">()
            + var1.iIIiiIIlIi
            + IIiilIiiiIii<"IIiilIiiiIii","eKQzJsHyjfjv9gQQsW7aPSvRon5Flidp+o96Xxyjqw==">()
            + var1.IlIiiIIlIi;
      return IIiilIiiiIii<"IIiilIiiiIii","7VuMiid2r/Fd24W2S79mllDQNNVGbcer7NKmLAwhSywzG47VVje3irV3h4E=">()
         + this.IliliiiIll.size()
         + IIiilIiiiIii<"IIiilIiiiIii","xj+So0INfjEFeXsar+3/xWnlkXmEJo5zTeKodiT7JJBBGJoqOQ==">()
         + this.iIiliiiIll.size()
         + IIiilIiiiIii<"IIiilIiiiIii","dH3lJViURcRr7wiwS3pjSymqBzkNblI57o7vXaCpyVGCSX8ZLrs=">()
         + this.lliliiiIll
         + IIiilIiiiIii<"IIiilIiiiIii","GWSrsc3jNYIHYjK01tuWp6c00QTXE1uAzcukPfdcFmktCQ==">()
         + var2;
   }

   private void IlIlllIlilIl() {
      Iterator var1 = this.IliliiiIll.entrySet().iterator();

      for (Long var3 : ((liiiiiIiiiiiiiIi)((Entry)var1.next()).getValue()).IIIiiIIlIi) {
         this.iIiliiiIll.remove(var3);
      }

      var1.remove();
   }
}
