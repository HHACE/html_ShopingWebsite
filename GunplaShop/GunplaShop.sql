USE [GunplaShop]
GO
/****** Object:  Table [dbo].[account]    Script Date: 7/7/2023 3:51:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[account](
	[fullname] [varchar](100) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[email] [varchar](100) NOT NULL,
	[password] [varchar](100) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[category]    Script Date: 7/7/2023 3:51:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[category](
	[cateID] [int] NOT NULL,
	[cateName] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[cateID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 7/7/2023 3:51:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [varchar](10) NOT NULL,
	[name] [varchar](255) NOT NULL,
	[img] [varchar](255) NOT NULL,
	[price] [decimal](10, 2) NOT NULL,
	[title] [varchar](255) NOT NULL,
	[description] [text] NOT NULL,
	[cateID] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[account] ([fullname], [username], [email], [password]) VALUES (N'John Smith', N'user01', N'john@example.com', N'32250170a0dca92d53ec9624f336ca24')
INSERT [dbo].[account] ([fullname], [username], [email], [password]) VALUES (N'Jane Doe', N'user02', N'jane@example.com', N'32250170a0dca92d53ec9624f336ca24')
INSERT [dbo].[account] ([fullname], [username], [email], [password]) VALUES (N'Michael Johnson', N'user03', N'michael@example.com', N'32250170a0dca92d53ec9624f336ca24')
INSERT [dbo].[account] ([fullname], [username], [email], [password]) VALUES (N'Emily Williams', N'user04', N'emily@example.com', N'32250170a0dca92d53ec9624f336ca24')
GO
INSERT [dbo].[category] ([cateID], [cateName]) VALUES (1, N'SD')
INSERT [dbo].[category] ([cateID], [cateName]) VALUES (2, N'HG')
INSERT [dbo].[category] ([cateID], [cateName]) VALUES (3, N'RG')
INSERT [dbo].[category] ([cateID], [cateName]) VALUES (4, N'MG')
INSERT [dbo].[category] ([cateID], [cateName]) VALUES (5, N'PG')
GO
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p001', N'HG UC 241 MS-06 Zaku II', N'/img/img01.jpg', CAST(15.99 AS Decimal(10, 2)), N'HG UC 241 MS-06 Zaku II', N'High quality plastic model', 2)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p002', N'HG Gundam Aerial Rebuild', N'/img/img02.jpg', CAST(25.00 AS Decimal(10, 2)), N'HG Gundam Aerial Rebuild', N'High quality plastic model', 2)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p003', N'HG UC MSN-06S Sinanju', N'/img/img03.jpg', CAST(25.00 AS Decimal(10, 2)), N'HG UC MSN-06S Sinanju', N'High quality plastic model', 2)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p004', N'HG Gundam LFRITH ', N'/img/img04.jpg', CAST(28.49 AS Decimal(10, 2)), N'HG Gundam LFRITH ', N'High quality plastic model', 2)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p005', N'RG Evangelion Unit-01', N'/img/img05.jpg', CAST(50.99 AS Decimal(10, 2)), N'RG Evangelion Unit-01', N'High quality plastic model', 3)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p006', N'RG 36 RX-93-V2 Hi-V Gundam', N'/img/img06.jpg', CAST(56.99 AS Decimal(10, 2)), N'RG 36 RX-93-V2 Hi-V Gundam', N'High quality plastic model', 3)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p007', N'RG 33 Force Impulse Gundam', N'/img/img07.jpg', CAST(35.99 AS Decimal(10, 2)), N'RG 33 Force Impulse Gundam', N'High quality plastic model', 3)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p008', N'RG 32 RX-93 Nu VGundam', N'/img/img08.jpg', CAST(46.99 AS Decimal(10, 2)), N'RG 32 RX-93 Nu VGundam', N'High quality plastic model', 3)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p009', N'RG 30 Full Armor Unicorn Gundam', N'/img/img09.jpg', CAST(58.00 AS Decimal(10, 2)), N'RG 30 Full Armor Unicorn Gundam', N'High quality plastic modelHigh quality plastic model', 3)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p010', N'RG 24 Gundam Astray Gold Frame Amatsu Mina
', N'/img/img10.jpg', CAST(32.99 AS Decimal(10, 2)), N'RG 24 Gundam Astray Gold Frame Amatsu Mina
', N'High quality plastic model', 3)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p011', N'MG Zeta Gundam Ver.Ka', N'/img/img11.jpg', CAST(54.99 AS Decimal(10, 2)), N'MG Zeta Gundam Ver.Ka', N'High quality plastic model', 4)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p012', N'MG MS-09 Dom 1.5 ', N'/img/img12.jpg', CAST(49.99 AS Decimal(10, 2)), N'MG MS-09 Dom 1.5 ', N'High quality plastic model', 4)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p013', N'P-Bandai MG Enhanced ZZ Gundam Ver.Ka', N'/img/img13.jpg', CAST(105.99 AS Decimal(10, 2)), N'P-Bandai MG Enhanced ZZ Gundam Ver.Ka', N'High quality plastic model', 4)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p014', N'MG Gundam Age-1 Normal', N'/img/img14.jpg', CAST(37.00 AS Decimal(10, 2)), N'MG Gundam Age-1 Normal', N'High quality plastic model', 4)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p015', N'MG Gundam Virtue', N'/img/img15.jpg', CAST(84.99 AS Decimal(10, 2)), N'MG Gundam Virtue', N'High quality plastic model', 4)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p016', N'MG Wing Gundam Zero EW Ver Ka', N'/img/img16.jpg', CAST(88.00 AS Decimal(10, 2)), N'MG Wing Gundam Zero EW Ver Ka', N'High quality plastic model', 4)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p017', N'PG Unleased RX-78-2 Gundam', N'/img/img17.jpg', CAST(345.00 AS Decimal(10, 2)), N'PG Unleased RX-78-2 Gundam', N'High quality plastic model', 5)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p018', N'
PG Gundam Exia with Lightning Mode', N'/img/img18.jpg', CAST(289.00 AS Decimal(10, 2)), N'
PG Gundam Exia with Lightning Mode', N'High quality plastic model', 5)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p019', N'PG RX-0 Unicorn Gundam', N'/img/img19.jpg', CAST(218.99 AS Decimal(10, 2)), N'PG RX-0 Unicorn Gundam', N'High quality plastic model', 5)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p020', N'PG Unicorn Gundam 03 Phenex', N'/img/img20.jpg', CAST(630.99 AS Decimal(10, 2)), N'PG Unicorn Gundam 03 Phenex', N'High quality plastic model', 5)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p021', N'HG Gundam Breaker Ground Urban Combat Type', N'/img/img21.jpg', CAST(20.00 AS Decimal(10, 2)), N'HG Gundam Breaker Ground Urban Combat Type', N'High quality plastic model', 2)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p022', N'HG UC 140 Nemo Unicorn Ver.', N'/img/img22.jpg', CAST(15.99 AS Decimal(10, 2)), N'HG UC 140 Nemo Unicorn Ver.', N'High quality plastic model', 2)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p023', N'HG UC LM312V04 Victory Gundam', N'/img/img23.jpg', CAST(15.99 AS Decimal(10, 2)), N'HG UC LM312V04 Victory Gundam', N'High quality plastic model', 2)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p024', N'SD Ex-Standard Aerial', N'/img/img24.jpg', CAST(8.99 AS Decimal(10, 2)), N'SD Ex-Standard Aerial ', N'High quality plastic model ', 1)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p025', N'SD BB 402 Gundam Barbatos Lupus DX', N'/img/img25.jpg', CAST(8.99 AS Decimal(10, 2)), N'SD BB 402 Gundam Barbatos Lupus DX', N'High quality plastic model', 1)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p026', N'SD EX-Standard Sazabi
', N'/img/img26.jpg', CAST(9.99 AS Decimal(10, 2)), N'SD EX-Standard Sazabi
', N'High quality plastic model', 1)
INSERT [dbo].[product] ([id], [name], [img], [price], [title], [description], [cateID]) VALUES (N'p027', N'SD CS Wing Gundam Zero EW', N'/img/img27.jpg', CAST(8.99 AS Decimal(10, 2)), N'SD CS Wing Gundam Zero EW', N'High quality plastic model', 1)
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK_product_category] FOREIGN KEY([cateID])
REFERENCES [dbo].[category] ([cateID])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK_product_category]
GO
