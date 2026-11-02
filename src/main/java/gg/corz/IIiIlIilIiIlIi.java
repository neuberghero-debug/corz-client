package gg.corz;

import java.util.List;
import java.util.Locale;

public record IIiIlIilIiIlIi(
   String kind,
   long target,
   long stand,
   int layer,
   int expected,
   double cost,
   long region,
   long missionId,
   long assetId,
   String owner,
   long proofRevision,
   List<Long> members,
   List<Long> memberStands,
   List<Integer> memberLayers
) {
   private final long iiIiIlIiiIIliIlIii;
   private final long IlliIlIiillliIlIii;
   private final List<Long> liliIlIiiiiliIlIii;
   private final long llIiIlIiiilIiIlIii;
   private final List<Long> illiIlIiiIiliIlIii;
   private final long IiIiIlIiiliIiIlIii;
   private final int liilIlIiiiiilIlIii;
   private final List<Integer> IIiiIlIiilIiiIlIii;
   private final long IlilIlIiillilIlIii;
   private final String lIliIlIiiiIliIlIii;
   private final int IIIiIlIiilIIiIlIii;
   private final long ililIlIiiIiilIlIii;
   private final double iIIiIlIiiIlIiIlIii;
   private final String lIilIlIiiiIilIlIii;

   public int IiIlliIliiIl() {
      return this.IIIiIlIiilIIiIlIii;
   }

   public IiiIlIiliiIlIi liiiIIllIl() {
      return new IiiIlIiliiIlIi(
         this.lIilIlIiiiIilIlIii,
         this.IIIiIlIiilIIiIlIii,
         this.iIIiIlIiiIlIiIlIii,
         this.IlilIlIiillilIlIii,
         this.lIliIlIiiiIliIlIii,
         this.IiIiIlIiiliIiIlIii,
         this.iiIiIlIiiIIliIlIii,
         this.llIiIlIiiilIiIlIii
      );
   }

   public List<Integer> IiIiliIiiiIi() {
      return this.IIiiIlIiilIiiIlIii;
   }

   public long iliIiiliiiii() {
      return this.IlilIlIiillilIlIii;
   }

   public String IilliliilIIi() {
      return String.format(
         Locale.ROOT,
         IIlilIliiIli<"IIlilIliiIli","7N/NihQbknzs5Zrx4/XLKZcVicMDPt2I0kFv0m4RM2yXeISkq4DWx9cmbi1nuNsHKsSaoUrK+j750v/FHCrQqsL7iriUFrDBhCvWsIup58BRAr6xDG7lJ9CSKuEMWw/Y5jpuoyg4Ej+DjEz97rYWBuMsaJm0KgQ2aicgcpnz3izdZQ4=">(),
         this.lIilIlIiiiIilIlIii,
         this.IlilIlIiillilIlIii,
         this.ililIlIiiIiilIlIii,
         this.liilIlIiiiiilIlIii,
         this.IIIiIlIiilIIiIlIii,
         this.iIIiIlIiiIlIiIlIii,
         this.IliIlllilIi(),
         this.IiIiIlIiiliIiIlIii,
         this.iiIiIlIiiIIliIlIii,
         this.llIiIlIiiilIiIlIii,
         this.illiIlIiiIiliIlIii.size()
      );
   }

   public List<Long> IlIillIiilIi() {
      return this.liliIlIiiiiliIlIii;
   }

   public long IIIllIIliIIl() {
      return this.ililIlIiiIiilIlIii;
   }

   public long Iilllilliill() {
      return this.IiIiIlIiiliIiIlIii;
   }

   public int IlIlllIlilIl() {
      return this.liilIlIiiiiilIlIii;
   }

   public IIiIlIilIiIlIi(String cost, long target, long stand, int layer, int expected, double kind) {
      this(
         cost,
         target,
         stand,
         layer,
         expected,
         kind,
         0L,
         0L,
         0L,
         IIlilIliiIli<"IIlilIliiIli","6Yg6Fc880zWnAbV+BX33TbWBrfnfyfLg9mJ4y5aua9D+goEJeiU=">(),
         0L,
         List.of()
      );
   }

   public IIiIlIilIiIlIi iIlIlllllill() {
      long var4 = -2959911935343005599L;
      if (this.illiIlIiiIiliIlIii.isEmpty()) {
         return this;
      } else {
         long var1 = this.liliIlIiiiiliIlIii.isEmpty() ? this.ililIlIiiIiilIlIii : this.liliIlIiiiiliIlIii.get(0);
         var4 ^= ((long)(this.IIiiIlIiilIiiIlIii.isEmpty() ? this.liilIlIiiiiilIlIii : this.IIiiIlIiilIiiIlIii.get(0)) << 32 ^ var4) & -1L << 32;
         return new IIiIlIilIiIlIi(
            this.lIilIlIiiiIilIlIii,
            this.illiIlIiiIiliIlIii.get(0),
            var1,
            (int)(var4 >>> 32),
            this.IIIiIlIiilIIiIlIii - 1,
            this.iIIiIlIiiIlIiIlIii,
            this.llIiIlIiiilIiIlIii,
            this.IiIiIlIiiliIiIlIii,
            this.iiIiIlIiiIIliIlIii,
            this.lIliIlIiiiIliIlIii,
            this.IlliIlIiillliIlIii,
            this.illiIlIiiIiliIlIii.subList(1, this.illiIlIiiIiliIlIii.size()),
            this.liliIlIiiiiliIlIii.isEmpty() ? List.of() : this.liliIlIiiiiliIlIii.subList(1, this.liliIlIiiiiliIlIii.size()),
            this.IIiiIlIiilIiiIlIii.isEmpty() ? List.of() : this.IIiiIlIiilIiiIlIii.subList(1, this.IIiiIlIiilIiiIlIii.size())
         );
      }
   }

   public String Ililllililil() {
      return this.lIliIlIiiiIliIlIii;
   }

   public long Iiilliiliiil() {
      return this.IlliIlIiillliIlIii;
   }

   public long IIillIiliIil() {
      return this.iiIiIlIiiIIliIlIii;
   }

   public String lIiiIiIlilli() {
      return this.lIilIlIiiiIilIlIii;
   }

   public double IliIlllilIi() {
      return this.IIIiIlIiilIIiIlIii <= 0 ? 0.0 : (double)this.IIIiIlIiilIIiIlIii / (1.0 + Math.max(0.0, this.iIIiIlIiiIlIiIlIii));
   }

   public long Illlllllilll() {
      return this.llIiIlIiiilIiIlIii;
   }

   public IIiIlIilIiIlIi(
      String cost,
      long missionId,
      long layer,
      int target,
      int stand,
      double kind,
      long region,
      long members,
      long owner,
      String expected,
      long assetId,
      List<Long> proofRevision
   ) {
      this(cost, missionId, layer, target, stand, kind, region, members, owner, expected, assetId, proofRevision, List.of(), List.of());
   }

   public IIiIlIilIiIlIi(
      String kind,
      long target,
      long stand,
      int layer,
      int expected,
      double cost,
      long region,
      long missionId,
      long assetId,
      String owner,
      long proofRevision,
      List<Long> members,
      List<Long> memberStands,
      List<Integer> memberLayers
   ) {
      kind = kind == null ? IIlilIliiIli<"IIlilIliiIli","LjT41TGH7u/DRkH3U3EQpRnB/JeGGeVN0YTnMLI3VuaV">() : kind;
      owner = owner == null ? IIlilIliiIli<"IIlilIliiIli","6Yg6Fc880zWnAbV+BX33TbWBrfnfyfLg9mJ4y5aua9D+goEJeiU=">() : owner;
      expected = Math.max(0, expected);
      members = members == null ? List.of() : List.copyOf(members);
      memberStands = memberStands != null && memberStands.size() == members.size() ? List.copyOf(memberStands) : List.of();
      memberLayers = memberLayers != null && memberLayers.size() == members.size() ? List.copyOf(memberLayers) : List.of();
      this.lIilIlIiiiIilIlIii = kind;
      this.IlilIlIiillilIlIii = target;
      this.ililIlIiiIiilIlIii = stand;
      this.liilIlIiiiiilIlIii = layer;
      this.IIIiIlIiilIIiIlIii = expected;
      this.iIIiIlIiiIlIiIlIii = cost;
      this.llIiIlIiiilIiIlIii = region;
      this.IiIiIlIiiliIiIlIii = missionId;
      this.iiIiIlIiiIIliIlIii = assetId;
      this.lIliIlIiiiIliIlIii = owner;
      this.IlliIlIiillliIlIii = proofRevision;
      this.illiIlIiiIiliIlIii = members;
      this.liliIlIiiiiliIlIii = memberStands;
      this.IIiiIlIiilIiiIlIii = memberLayers;
   }

   public double IIlllIlliIll() {
      return this.iIIiIlIiiIlIiIlIii;
   }

   public List<Long> IIIilIIiiIIi() {
      return this.illiIlIiiIiliIlIii;
   }
}
